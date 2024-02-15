package com.example.coworkingreservation.domain.models

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp

/**
 * Class for store information about room area and position on the map.
 *
 * @property [vertex] information about polygon.
 * @property [roomInfo] information about room.
 */
@Immutable
data class RoomPosition(
    val vertex: Array<Pair<Dp, Dp>>,
    val roomInfo: UiMeetingRoomInfo
)