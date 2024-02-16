package com.example.coworkingreservation.domain.models

import androidx.compose.runtime.Immutable

/**
 * Class for store information about meeting room.
 *
 * @property [id] meeting room id.
 * @property [classroom] meeting room number
 * @property [classroomName] meeting room name
 * @property [capacity] capacity of room.
 * @property [daysOrderBefore] the number of days before for ordering room.
 * @property [isEquipment] if any equipment in room or not.
 * @property [responsible] a list of people who are responsible for this room.
 * @property [occupation] a list of timelines when room is free or not.
 */
@Immutable
data class UiMeetingRoomInfo(
    val id: String,
    val classroom: String,
    val classroomName: String?,
    val capacity: Int,
    val daysOrderBefore: Int,
    val isEquipment: Boolean,
    val responsible: List<String>,
    val occupation: List<Boolean>
)
