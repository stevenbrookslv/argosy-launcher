package com.nendo.argosy.ui.screens.social

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

data class FeedOptionsState(
    val showOptionsModal: Boolean = false,
    val optionsModalFocusIndex: Int = 0,
    val showReportReasonModal: Boolean = false,
    val reportReasonFocusIndex: Int = 0
)

class FeedOptionsDelegate {

    private val _state = MutableStateFlow(FeedOptionsState())
    val state: StateFlow<FeedOptionsState> = _state.asStateFlow()

    fun showOptionsModal() {
        _state.update { it.copy(showOptionsModal = true, optionsModalFocusIndex = 0) }
    }

    fun hideOptionsModal() {
        _state.update { it.copy(showOptionsModal = false) }
    }

    fun moveOptionsFocus(delta: Int, userName: String?, hasEvent: Boolean): Boolean {
        val maxIndex = getOptionCount(userName, hasEvent) - 1
        val current = _state.value.optionsModalFocusIndex
        val newIndex = (current + delta).coerceIn(0, maxIndex)
        if (newIndex != current) {
            _state.update { it.copy(optionsModalFocusIndex = newIndex) }
            return true
        }
        return false
    }

    fun resolveOptionAction(userName: String?, hasEvent: Boolean): FeedOption? {
        val index = _state.value.optionsModalFocusIndex

        var currentIdx = 0
        val createDoodleIdx = currentIdx++
        val viewProfileIdx = if (userName != null && hasEvent) currentIdx++ else -1
        val shareScreenshotIdx = if (hasEvent) currentIdx++ else -1
        val reportPostIdx = if (hasEvent) currentIdx++ else -1
        val hidePostIdx = if (hasEvent) currentIdx++ else -1

        return when (index) {
            createDoodleIdx -> FeedOption.CREATE_DOODLE
            viewProfileIdx -> FeedOption.VIEW_PROFILE
            shareScreenshotIdx -> FeedOption.SHARE_SCREENSHOT
            reportPostIdx -> FeedOption.REPORT_POST
            hidePostIdx -> FeedOption.HIDE_POST
            else -> null
        }
    }

    fun showReportReasonModal() {
        _state.update { it.copy(showReportReasonModal = true, reportReasonFocusIndex = 0) }
    }

    fun hideReportReasonModal() {
        _state.update { it.copy(showReportReasonModal = false) }
    }

    fun moveReportReasonFocus(delta: Int): Boolean {
        val maxIndex = REPORT_REASON_COUNT - 1
        val current = _state.value.reportReasonFocusIndex
        val newIndex = (current + delta).coerceIn(0, maxIndex)
        if (newIndex != current) {
            _state.update { it.copy(reportReasonFocusIndex = newIndex) }
            return true
        }
        return false
    }

    fun resolveReportReason(): ReportReason {
        return ReportReason.entries[_state.value.reportReasonFocusIndex]
    }

    fun reset() {
        _state.value = FeedOptionsState()
    }

    private fun getOptionCount(userName: String?, hasEvent: Boolean): Int {
        var count = 1 // Create Doodle is always present
        if (hasEvent) {
            count += 3 // Share, Report, Hide
            if (userName != null) {
                count += 1 // View Profile
            }
        }
        return count
    }
}
