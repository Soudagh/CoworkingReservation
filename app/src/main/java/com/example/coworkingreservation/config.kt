package com.example.coworkingreservation

import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.domain.models.RoomPosition
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo

data class Floor(
    val rooms: List<RoomPosition> = listOf(),
    val image: Int = 0
)

val config = mapOf(
    1 to Floor(
        rooms = listOf(
            RoomPosition(
                x = (-85).dp,
                y = (-138).dp,
                height = 40.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "1",
                    classroom = "1303/1",
                    classroomName = "Переговорная 1",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-85).dp,
                y = (-98).dp,
                height = 40.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "2",
                    classroom = "1303/2",
                    classroomName = "Переговорная 2",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-85).dp,
                y = (-60).dp,
                height = 35.dp,
                width = 60.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "3",
                    classroom = "1303/3",
                    classroomName = "Переговорная 3",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-62).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "4",
                    classroom = "1303/4",
                    classroomName = "Переговорная 4",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-98).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "5",
                    classroom = "1303/5",
                    classroomName = "Переговорная 5",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-133).dp,
                y = 25.dp,
                height = 45.dp,
                width = 34.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "6",
                    classroom = "1303/6",
                    classroomName = "Переговорная 6",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
                x = (-45).dp,
                y = (126).dp,
                height = 78.dp,
                width = 37.dp,
                roomInfo = UiMeetingRoomInfo(
                    id = "7",
                    classroom = "1303/7",
                    classroomName = "Переговорная 7",
                    capacity = 10,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            ),
            RoomPosition(
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
                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
                )
            )
        ),
        image = R.drawable.lomo_map
    )
)