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
                vertex = arrayOf(
                    Pair(((-85) - 60 / 2).dp, ((-138) - 40 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-138) - 40 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-138) + 40 / 2).dp),
                    Pair(((-85) - 60 / 2).dp, ((-138) + 40 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "1",
                    classroom = "1303/1",
                    classroomName = "Переговорная 1",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-85) - 60 / 2).dp, ((-98) - 40 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-98) - 40 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-98) + 40 / 2).dp),
                    Pair(((-85) - 60 / 2).dp, ((-98) + 40 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "2",
                    classroom = "1303/2",
                    classroomName = "Переговорная 2",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-85) - 60 / 2).dp, ((-60) - 35 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-60) - 35 / 2).dp),
                    Pair(((-85) + 60 / 2).dp, ((-60) + 35 / 2).dp),
                    Pair(((-85) - 60 / 2).dp, ((-60) + 35 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "3",
                    classroom = "1303/3",
                    classroomName = "Переговорная 3",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-62) - 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-62) + 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-62) + 34 / 2).dp, (25 + 45 / 2).dp),
                    Pair(((-62) - 34 / 2).dp, (25 + 45 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "4",
                    classroom = "1303/4",
                    classroomName = "Переговорная 4",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-98) - 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-98) + 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-98) + 34 / 2).dp, (25 + 45 / 2).dp),
                    Pair(((-98) - 34 / 2).dp, (25 + 45 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "5",
                    classroom = "1303/5",
                    classroomName = "Переговорная 5",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-133) - 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-133) + 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-133) + 34 / 2).dp, (25 + 45 / 2).dp),
                    Pair(((-133) - 34 / 2).dp, (25 + 45 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "6",
                    classroom = "1303/6",
                    classroomName = "Переговорная 6",
                    capacity = 4,
                    daysOrderBefore = 0,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-45) - 37 / 2).dp, (126 - 78 / 2).dp),
                    Pair(((-45) + 37 / 2).dp, (126 - 78 / 2).dp),
                    Pair(((-45) + 37 / 2).dp, (126 + 78 / 2).dp),
                    Pair(((-45) - 37 / 2).dp, (126 + 78 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "7",
                    classroom = "1303/7",
                    classroomName = "Переговорная 7",
                    capacity = 10,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair((87 - 125 / 2).dp, (80 - 164 / 2).dp),
                    Pair((87 + 125 / 2).dp, (80 - 164 / 2).dp),
                    Pair((87 + 125 / 2).dp, (80 + 164 / 2).dp),
                    Pair((87 - 125 / 2).dp, (80 + 164 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "8",
                    classroom = "1303/8",
                    classroomName = "Медиазона",
                    capacity = 80,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Подрядчикова Екатерина Дмитриевна",
                        "Бельмас Лилия Минниахметовна"
                    )
                )
            )
        ),
        image = R.drawable.lomo_map
    ),
//        2 to Floor(
//        rooms = listOf(
//            RoomPosition(
//                x = 87.dp,
//                y = 80.dp,
//                height = 164.dp,
//                width = 125.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "8",
//                    classroom = "1303/8",
//                    classroomName = "Медиазона",
//                    capacity = 80,
//                    daysOrderBefore = 0,
//                    isEquipment = true,
//                    occupation = listOf(),
//                    responsible = listOf("Подрядчикова Екатерина Дмитриевна", "Бельмас Лилия Минниахметовна")
//                )
//            )
//        ),
//        image = R.drawable.kronva_map
//    ),
    3 to Floor(
        rooms = listOf(
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-62) - 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-62) + 34 / 2).dp, (25 - 45 / 2).dp),
                    Pair(((-62) + 34 / 2).dp, (25 + 45 / 2).dp),
                    Pair(((-62) - 34 / 2).dp, (25 + 45 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "9",
                    classroom = "1400/д",
                    classroomName = "Переговорная 17",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
                )
            ),
//            RoomPosition(
//                vertex = arrayOf(
//                    Pair(((-98) - 34 / 2).dp, (25 - 45 / 2).dp),
//                    Pair(((-98) + 34 / 2).dp, (25 - 45 / 2).dp),
//                    Pair(((-98) + 34 / 2).dp, (25 + 45 / 2).dp),
//                    Pair(((-98) - 34 / 2).dp, (25 + 45 / 2).dp)
//                ),
//                roomInfo = UiMeetingRoomInfo(
//                    id = "10",
//                    classroom = "1400/е",
//                    classroomName = "Переговорная 18",
//                    capacity = 20,
//                    daysOrderBefore = 1,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
//                )
//            ),
//            RoomPosition(
//                vertex = arrayOf(
//                    Pair(((-133) - 34 / 2).dp, (25 - 45 / 2).dp),
//                    Pair(((-133) + 34 / 2).dp, (25 - 45 / 2).dp),
//                    Pair(((-133) + 34 / 2).dp, (25 + 45 / 2).dp),
//                    Pair(((-133) - 34 / 2).dp, (25 + 45 / 2).dp)
//                ),
//                roomInfo = UiMeetingRoomInfo(
//                    id = "12",
//                    classroom = "1400/ж",
//                    classroomName = "Переговорная 19",
//                    capacity = 20,
//                    daysOrderBefore = 1,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
//                )
//            ),
//            RoomPosition(
//                vertex =,
//                x = (-128).dp,
//                y = 147.dp,
//                height = 50.dp,
//                width = 45.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "12",
//                    classroom = "1400/и",
//                    classroomName = "Переговорная 21",
//                    capacity = 20,
//                    daysOrderBefore = 1,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf(" Живицкая Яна Алиевна", "Борисова Елена Александровна")
//                )
//            ),
//            RoomPosition(
//                vertex =,
//                x = (-85).dp,
//                y = 147.dp,
//                height = 52.dp,
//                width = 45.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "12",
//                    classroom = "1400/з",
//                    classroomName = "Переговорная 22",
//                    capacity = 20,
//                    daysOrderBefore = 1,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf(" Живицкая Яна Алиевна", "Борисова Елена Александровна")
//                )
//            )
        ),
        image = R.drawable.so_map
    )
)