package com.nendo.argosy.ui.screens.social

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Block
import androidx.compose.material.icons.filled.Brush
import androidx.compose.material.icons.filled.Flag
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Report
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.runtime.Composable
import com.nendo.argosy.ui.components.Modal
import com.nendo.argosy.ui.screens.gamedetail.components.OptionItem

enum class FeedOption {
    CREATE_DOODLE,
    VIEW_PROFILE,
    SHARE_SCREENSHOT,
    REPORT_POST,
    HIDE_POST
}

enum class ReportReason(val value: String, val label: String) {
    SPAM("spam", "Spam or repetitive content"),
    HARASSMENT("harassment", "Harassment or bullying"),
    INAPPROPRIATE("inappropriate", "Inappropriate or offensive"),
    MISINFORMATION("misinformation", "False or misleading info")
}

@Composable
fun FeedOptionsModal(
    focusIndex: Int,
    userName: String?,
    hasEvent: Boolean,
    onAction: (FeedOption) -> Unit,
    onDismiss: () -> Unit
) {
    Modal(title = "Options", onDismiss = onDismiss) {
        var currentIndex = 0

        OptionItem(
            icon = Icons.Default.Brush,
            label = "Create Doodle",
            isFocused = focusIndex == currentIndex,
            onClick = { onAction(FeedOption.CREATE_DOODLE) }
        )
        currentIndex++

        if (userName != null && hasEvent) {
            OptionItem(
                icon = Icons.Default.Person,
                label = "View $userName's Profile",
                isFocused = focusIndex == currentIndex,
                onClick = { onAction(FeedOption.VIEW_PROFILE) }
            )
            currentIndex++
        }

        if (hasEvent) {
            OptionItem(
                icon = Icons.Default.Share,
                label = "Share Screenshot",
                isFocused = focusIndex == currentIndex,
                onClick = { onAction(FeedOption.SHARE_SCREENSHOT) }
            )
            currentIndex++

            OptionItem(
                icon = Icons.Default.Flag,
                label = "Report Post",
                isFocused = focusIndex == currentIndex,
                onClick = { onAction(FeedOption.REPORT_POST) }
            )
            currentIndex++

            OptionItem(
                icon = Icons.Default.VisibilityOff,
                label = "Hide Post",
                isFocused = focusIndex == currentIndex,
                onClick = { onAction(FeedOption.HIDE_POST) }
            )
        }
    }
}

@Composable
fun ReportReasonModal(
    focusIndex: Int,
    onReasonSelect: (ReportReason) -> Unit,
    onDismiss: () -> Unit
) {
    Modal(title = "Report Reason", onDismiss = onDismiss) {
        ReportReason.entries.forEachIndexed { index, reason ->
            OptionItem(
                icon = when (reason) {
                    ReportReason.SPAM -> Icons.Default.Block
                    ReportReason.HARASSMENT -> Icons.Default.Report
                    ReportReason.INAPPROPRIATE -> Icons.Default.Flag
                    ReportReason.MISINFORMATION -> Icons.Default.Report
                },
                label = reason.label,
                isFocused = focusIndex == index,
                onClick = { onReasonSelect(reason) }
            )
        }
    }
}

const val REPORT_REASON_COUNT = 4
