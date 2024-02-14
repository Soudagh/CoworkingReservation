package com.example.coworkingreservation.domain.models

import androidx.compose.runtime.Immutable
import androidx.compose.ui.unit.Dp

/**
 * Class for store information about room area and position on the map.
 *
 * @property [x] x offset.
 * @property [y] y offset.
 * @property [height] height of the room on the map.
 * @property [width] width of the room on the map.
 * @property [roomInfo] information about room.
 */
@Immutable
data class RoomPosition(
    val x: Dp,
    val y: Dp,
    val height: Dp,
    val width: Dp,
    val roomInfo: UiMeetingRoomInfo
)