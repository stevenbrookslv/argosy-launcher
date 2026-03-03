package com.nendo.argosy.ui.screens.social

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.nendo.argosy.data.social.SocialUser
import com.nendo.argosy.ui.components.SwitchPreference

@Composable
fun ProfileTabContent(
    user: SocialUser?,
    focusIndex: Int,
    onlineStatus: Boolean,
    showNowPlaying: Boolean,
    notifyFriendOnline: Boolean,
    notifyFriendPlaying: Boolean,
    onToggleOnlineStatus: (Boolean) -> Unit,
    onToggleShowNowPlaying: (Boolean) -> Unit,
    onToggleNotifyFriendOnline: (Boolean) -> Unit,
    onToggleNotifyFriendPlaying: (Boolean) -> Unit
) {
    if (user == null) {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Not connected",
                style = MaterialTheme.typography.bodyLarge,
                color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
            )
        }
        return
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(horizontal = 24.dp, vertical = 12.dp),
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        AccountInfoCard(user = user)

        Spacer(modifier = Modifier.height(8.dp))

        SectionHeader("PRIVACY")

        SwitchPreference(
            title = "Online Status",
            subtitle = "Show when you are online",
            isEnabled = onlineStatus,
            isFocused = focusIndex == 0,
            onToggle = { onToggleOnlineStatus(!onlineStatus) }
        )

        SwitchPreference(
            title = "Show Now Playing",
            subtitle = "Share what you are currently playing",
            isEnabled = showNowPlaying,
            isFocused = focusIndex == 1,
            onToggle = { onToggleShowNowPlaying(!showNowPlaying) }
        )

        Spacer(modifier = Modifier.height(8.dp))

        SectionHeader("NOTIFICATIONS")

        SwitchPreference(
            title = "Friend Online",
            subtitle = "Notify when a friend comes online",
            isEnabled = notifyFriendOnline,
            isFocused = focusIndex == 2,
            onToggle = { onToggleNotifyFriendOnline(!notifyFriendOnline) }
        )

        SwitchPreference(
            title = "Friend Playing",
            subtitle = "Notify when a friend starts a game",
            isEnabled = notifyFriendPlaying,
            isFocused = focusIndex == 3,
            onToggle = { onToggleNotifyFriendPlaying(!notifyFriendPlaying) }
        )
    }
}

@Composable
private fun AccountInfoCard(user: SocialUser) {
    val avatarColor = try {
        Color(android.graphics.Color.parseColor(user.avatarColor))
    } catch (e: Exception) {
        Color(0xFF6366F1)
    }

    Card(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(56.dp)
                    .clip(CircleShape)
                    .background(avatarColor),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = user.displayName.take(1).uppercase(),
                    style = MaterialTheme.typography.headlineSmall,
                    color = Color.White,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
                Text(
                    text = user.displayName,
                    style = MaterialTheme.typography.titleLarge,
                    color = MaterialTheme.colorScheme.onSurface
                )
                Text(
                    text = "@${user.username}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = MaterialTheme.colorScheme.onSurface.copy(alpha = 0.5f)
                )
            }
        }
    }
}

@Composable
private fun SectionHeader(title: String) {
    Text(
        text = title,
        style = MaterialTheme.typography.labelMedium,
        color = MaterialTheme.colorScheme.primary,
        fontWeight = FontWeight.SemiBold,
        modifier = Modifier.padding(start = 4.dp, top = 8.dp, bottom = 4.dp)
    )
}
