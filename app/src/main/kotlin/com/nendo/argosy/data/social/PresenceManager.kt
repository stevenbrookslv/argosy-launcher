package com.nendo.argosy.data.social

import android.app.Application
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.util.Log
import com.nendo.argosy.data.emulator.ActiveSession
import com.nendo.argosy.data.emulator.PlaySessionTracker
import com.nendo.argosy.data.local.dao.GameDao
import com.nendo.argosy.data.preferences.UserPreferencesRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PresenceManager @Inject constructor(
    private val application: Application,
    private val socialRepository: SocialRepository,
    private val playSessionTracker: PlaySessionTracker,
    private val preferencesRepository: UserPreferencesRepository,
    private val gameDao: GameDao
) {
    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    private var lastSentStatus: PresenceStatus? = null
    private var lastSentGameId: Int? = null

    private val _screenOn = MutableStateFlow(true)

    private val screenReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.action) {
                Intent.ACTION_SCREEN_OFF -> {
                    Log.d(TAG, "Screen off")
                    _screenOn.value = false
                }
                Intent.ACTION_SCREEN_ON -> {
                    Log.d(TAG, "Screen on")
                    _screenOn.value = true
                }
            }
        }
    }

    init {
        registerScreenReceiver()
        observePresenceChanges()
    }

    private fun registerScreenReceiver() {
        val filter = IntentFilter().apply {
            addAction(Intent.ACTION_SCREEN_OFF)
            addAction(Intent.ACTION_SCREEN_ON)
        }
        application.registerReceiver(screenReceiver, filter)
    }

    private fun observePresenceChanges() {
        scope.launch {
            combine(
                playSessionTracker.activeSession,
                preferencesRepository.userPreferences.map { prefs ->
                    Triple(prefs.socialOnlineStatusEnabled, prefs.socialShowNowPlaying, prefs.isSocialLinked)
                }.distinctUntilChanged(),
                socialRepository.serviceConnectionState,
                _screenOn
            ) { playSession, prefsTriple, serviceState, screenOn ->
                PresenceContext(
                    playSession = playSession,
                    onlineStatusEnabled = prefsTriple.first,
                    showNowPlaying = prefsTriple.second,
                    isSocialLinked = prefsTriple.third,
                    isConnected = serviceState is ArgosSocialService.ConnectionState.Connected,
                    isScreenOn = screenOn
                )
            }
            .collect { context ->
                updatePresence(context)
            }
        }
    }

    private suspend fun updatePresence(context: PresenceContext) {
        if (!context.isSocialLinked || !context.isConnected) {
            if (!context.isConnected) {
                lastSentStatus = null
                lastSentGameId = null
            }
            return
        }

        val presenceInfo = calculatePresence(context)

        if (presenceInfo.status != lastSentStatus || presenceInfo.gameIgdbId != lastSentGameId) {
            Log.d(TAG, "Sending presence: ${presenceInfo.status}, game=${presenceInfo.gameTitle}")
            socialRepository.sendPresence(presenceInfo.status, presenceInfo.gameIgdbId, presenceInfo.gameTitle)
            lastSentStatus = presenceInfo.status
            lastSentGameId = presenceInfo.gameIgdbId
        }
    }

    private data class PresenceInfo(val status: PresenceStatus, val gameIgdbId: Int?, val gameTitle: String?)

    private suspend fun calculatePresence(context: PresenceContext): PresenceInfo {
        if (!context.onlineStatusEnabled || !context.isScreenOn) {
            return PresenceInfo(PresenceStatus.OFFLINE, null, null)
        }

        val playSession = context.playSession
        if (playSession != null) {
            return if (context.showNowPlaying) {
                val gameInfo = getGameInfo(playSession.gameId)
                PresenceInfo(PresenceStatus.IN_GAME, gameInfo?.first, gameInfo?.second)
            } else {
                PresenceInfo(PresenceStatus.ONLINE, null, null)
            }
        }

        return PresenceInfo(PresenceStatus.ONLINE, null, null)
    }

    private suspend fun getGameInfo(gameId: Long): Pair<Int?, String?>? {
        val game = gameDao.getById(gameId) ?: return null
        return game.igdbId?.toInt() to game.title
    }

    private data class PresenceContext(
        val playSession: ActiveSession?,
        val onlineStatusEnabled: Boolean,
        val showNowPlaying: Boolean,
        val isSocialLinked: Boolean,
        val isConnected: Boolean,
        val isScreenOn: Boolean
    )

    companion object {
        private const val TAG = "PresenceManager"
    }
}
