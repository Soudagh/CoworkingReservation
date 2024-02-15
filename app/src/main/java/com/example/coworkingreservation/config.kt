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
    2 to Floor(
        rooms = listOf(
            RoomPosition(
                vertex = arrayOf(
                    Pair((-77.50614).dp, (-108.9534).dp),
                    Pair((-16.371933).dp, (-116.95145).dp),
                    Pair((-6.6537323).dp, (-42.955902).dp),
                    Pair((-80.657646).dp, (-33.243988).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "9",
                    classroom = "1312",
                    classroomName = "Конференц-зал",
                    capacity = 40,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Королькова Людмила Анатольевна",
                        "Ворожцова Юлия Андреевна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair((-43.793808).dp, (-38.38559).dp),
                    Pair((-6.94252).dp, (-42.955902).dp),
                    Pair(1.3443146.dp, 21.327698.dp),
                    Pair((-35.79576).dp, 26.768555.dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "10",
                    classroom = "1311",
                    classroomName = "Переговорная 1",
                    capacity = 10,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Королькова Людмила Анатольевна",
                        "Ворожцова Юлия Андреевна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair((-82.365234).dp, (-0.38128662).dp),
                    Pair((-40.077286).dp, (-5.822113).dp),
                    Pair((-35.79576).dp, 26.4693.dp),
                    Pair((-83.79659).dp, 32.481445.dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "11",
                    classroom = "1314",
                    classroomName = "Переговорная 2",
                    capacity = 6,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Королькова Людмила Анатольевна",
                        "Ворожцова Юлия Андреевна"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(71.90793.dp, 40.479492.dp),
                    Pair(141.34152.dp, 23.612854.dp),
                    Pair(144.76926.dp, 35.038635.dp),
                    Pair(151.62473.dp, 91.052185.dp),
                    Pair(83.6225.dp, 102.75.dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "12",
                    classroom = "1301",
                    classroomName = "Амфитеатр",
                    capacity = 30,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Королькова Людмила Анатольевна",
                        "Ворожцова Юлия Андреевна"
                    )
                )
            ),
        ),
        image = R.drawable.kronva_map
    ),
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
                    id = "13",
                    classroom = "1400/д",
                    classroomName = "Переговорная 17",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
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
                    id = "14",
                    classroom = "1400/е",
                    classroomName = "Переговорная 18",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
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
                    id = "15",
                    classroom = "1400/ж",
                    classroomName = "Переговорная 19",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-128) - 45 / 2).dp, (147 - 50 / 2).dp),
                    Pair(((-128) + 45 / 2).dp, (147 - 50 / 2).dp),
                    Pair(((-128) + 45 / 2).dp, (147 + 50 / 2).dp),
                    Pair(((-128) - 45 / 2).dp, (147 + 50 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "16",
                    classroom = "1400/и",
                    classroomName = "Переговорная 21",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(((-84) - 45 / 2).dp, (147 - 50 / 2).dp),
                    Pair(((-84) + 45 / 2).dp, (147 - 50 / 2).dp),
                    Pair(((-84) + 45 / 2).dp, (147 + 50 / 2).dp),
                    Pair(((-84) - 45 / 2).dp, (147 + 50 / 2).dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "17",
                    classroom = "1400/з",
                    classroomName = "Переговорная 20",
                    capacity = 20,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Живицкая Яна Алиевна", "Борисова Елена Александровна")
                )
            )
        ),
        image = R.drawable.so_map
    ),
    4 to Floor(
        rooms = listOf(
            RoomPosition(
                vertex = arrayOf(
                    Pair((-140.08426).dp, (-269.81207).dp),
                    Pair(40.480743.dp, (-269.81207).dp),
                    Pair(40.480743.dp, 270.19208.dp),
                    Pair((-140.08426).dp, 269.6208.dp)
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "18",
                    classroom = "2101",
                    classroomName = "Лекторий 2101",
                    capacity = 40,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Самусевич Ксения Леонидовна",
                        "Старосек Дмитрий"
                    )
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair(42.200897.dp, (-148.94363).dp),
                    Pair(126.48801.dp, (-148.10031).dp),
                    Pair(126.76422.dp, (-27.803162).dp),
                    Pair(42.200897.dp, (-27.803162).dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "19",
                    classroom = "2101/1",
                    classroomName = "Переговорная 1",
                    capacity = 6,
                    daysOrderBefore = 0,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf(
                        "Самусевич Ксения Леонидовна",
                        "Старосек Дмитрий"
                    )
                )
            )
        ),
        image = R.drawable.yandex_map
    ),
    5 to Floor(
        rooms = listOf(
            RoomPosition(
                vertex = arrayOf(
                    Pair(7.6347656.dp, (-204.38588).dp),
                    Pair(94.483246.dp, (-204.08664).dp),
                    Pair(94.483246.dp, (-122.09305).dp),
                    Pair(7.6347656.dp, (-121.821014).dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "21",
                    classroom = "612",
                    classroomName = "Переговорная 1",
                    capacity = 8,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Бобрицкая Елена Игоревна", "Ивашкова Ксения Павловна")
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair((-94.36858).dp, 158.19226.dp),
                    Pair((-22.373611).dp, 158.19226.dp),
                    Pair((-21.796036).dp, 214.17859.dp),
                    Pair((-94.079796).dp, 214.47784.dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "21",
                    classroom = "601а",
                    classroomName = "Переговорная 1",
                    capacity = 2,
                    daysOrderBefore = 1,
                    isEquipment = true,
                    occupation = listOf(),
                    responsible = listOf("Бобрицкая Елена Игоревна", "Ивашкова Ксения Павловна")
                )
            ),
            RoomPosition(
                vertex = arrayOf(
                    Pair((-94.36858).dp, (-376.3711).dp),
                    Pair(93.91824.dp, (-376.3711).dp),
                    Pair(94.483246.dp, (-236.07883).dp),
                    Pair((-94.36858).dp, (-235.80678).dp),
                ),
                roomInfo = UiMeetingRoomInfo(
                    id = "22",
                    classroom = "611",
                    classroomName = "Стартап-Чердак",
                    capacity = 35,
                    daysOrderBefore = 1,
                    isEquipment = false,
                    occupation = listOf(),
                    responsible = listOf("Бобрицкая Елена Игоревна", "Ивашкова Ксения Павловна")
                )
            )
        ),
        image = R.drawable.birzha_map
    )
)
