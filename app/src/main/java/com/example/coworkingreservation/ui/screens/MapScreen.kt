package com.example.coworkingreservation.ui.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.domain.models.RoomArea
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo
import com.example.coworkingreservation.ui.components.maps.Map

data class Floor(
    val rooms: List<RoomArea> = listOf(),
    val image: Int = 0
)

val config = mapOf(
    1 to Floor(
        rooms = listOf(
            RoomArea(
                x = (-85).dp,
                y = (-138).dp,
                height = 40.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "1",
                    classroom = "1303/1",
                    classroomName = "П1",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-85).dp,
                y = (-98).dp,
                height = 40.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "2",
                    classroom = "1303/2",
                    classroomName = "П2",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-85).dp,
                y = (-60).dp,
                height = 35.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "3",
                    classroom = "1303/3",
                    classroomName = "П3",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-62).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "4",
                    classroom = "1303/4",
                    classroomName = "П4",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-98).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "5",
                    classroom = "1303/5",
                    classroomName = "П5",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-133).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "6",
                    classroom = "1303/6",
                    classroomName = "П6",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = 87.dp,
                y = 80.dp,
                height = 164.dp,
                width = 125.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "8",
                    classroom = "1303/8",
                    classroomName = "Медиазона",
                    capacity = 80,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            ),
            RoomArea(
                x = (-45).dp,
                y = (126).dp,
                height = 78.dp,
                width = 37.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "8",
                    classroom = "1303/8",
                    classroomName = "Медиазона",
                    capacity = 80,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
                )
            )
        ),
        image = R.drawable.lomo_map
    )
)

@Composable
fun MapScreen(mapId: Int) {
    config[mapId]?.let { Map(it) }
}

@Preview
@Composable
fun MapScreenPreview() {
    MapScreen(mapId = 1)
}