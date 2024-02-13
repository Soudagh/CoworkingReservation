package com.example.coworkingreservation.domain.models

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp

@Immutable
data class RoomArea(
    val x: Dp,
    val y: Dp,
    val height: Dp,
    val width: Dp,
    val roomInfo: UiMeetingRoomInfo
)