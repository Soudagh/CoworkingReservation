package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coworkingreservation.Floor
import com.example.coworkingreservation.R
import com.example.coworkingreservation.domain.models.MeetingRoomViewModel
import com.example.coworkingreservation.domain.models.RoomPosition
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo
import com.example.coworkingreservation.ui.navigation.Graph

@Composable
fun Map(
    floor: Floor,
    navHostController: NavHostController,
    meetingRoomViewModel: MeetingRoomViewModel
) {
    var roomInfo by remember {
        mutableStateOf(
            UiMeetingRoomInfo(
                id = "1",
                classroom = "1303/1",
                classroomName = "П1",
                capacity = 4,
                daysOrderBefore = 0,
                isEquipment = false,
                occupation = listOf(),
                responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
            )
        )
    }
    val configuration = LocalConfiguration.current

    val screenCenterY = configuration.screenHeightDp.dp / 2
    val screenCenterX = configuration.screenWidthDp.dp / 2

    val state = remember { mutableStateOf(false) }

    Box(contentAlignment = Alignment.Center) {
        Image(
            imageVector = ImageVector.vectorResource(floor.image),
            contentDescription = null
        )
        BoxWithConstraints(modifier = Modifier.fillMaxSize()) {
            val height = maxHeight
            val width = maxWidth
            Box(
                modifier = Modifier
                    .pointerInput(width, height) {
                        detectTapGestures(
                            onTap = { tapOffset ->
                                for (room in floor.rooms) {
                                    val mapX = room.vertex.map { it.first }
                                    val mapY = room.vertex.map { it.second }

                                    val minX = mapX.min() + screenCenterX
                                    val minY = mapY.min() + screenCenterY
                                    val maxY = mapY.max() + screenCenterY
                                    val maxX = mapX.max() + screenCenterX

                                    if (
                                        (minX.toPx() <= tapOffset.x && maxX.toPx() >= tapOffset.x)
                                        && (minY.toPx() <= tapOffset.y && maxY.toPx() >= tapOffset.y)
                                    ) {
                                        roomInfo = room.roomInfo
                                        state.value = true
                                        break
                                    }
                                }

                            }
                        )
                    }
                    .align(Alignment.Center)
                    .fillMaxSize(),
            )
        }
    }


    if (state.value) {
        MeetingRoomInfoDialog(
            roomInfo = roomInfo,
            onReservationClick = {
                meetingRoomViewModel.addRoomInfo(roomInfo)
                navHostController.navigate(Graph.RESERVATION)
                state.value = false
            },
            onReservedClick = {},
            onDismiss = { state.value = false })
    }
}

@Preview
@Composable
fun MapPreview() {
    Map(
        meetingRoomViewModel = MeetingRoomViewModel(),
        navHostController = rememberNavController(),
        floor = Floor(
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
        )
    )
}