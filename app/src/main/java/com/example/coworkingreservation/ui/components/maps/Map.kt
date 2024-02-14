package com.example.coworkingreservation.ui.components.maps

import android.util.Log
import androidx.compose.foundation.Canvas
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
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.Floor
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo
import com.example.coworkingreservation.ui.components.MeetingRoomInfoDialog
import com.example.coworkingreservation.ui.theme.PrimaryBlue

@Composable
fun Map(floor: Floor) {
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
            for (room in floor.rooms) {

                val mapX = room.vertex.map { it.first }
                val mapY = room.vertex.map { it.second }

                val minX = mapX.min() + screenCenterX
                val minY = mapY.min() + screenCenterY
                val maxY = mapY.max() + screenCenterY
                val maxX = mapX.max() + screenCenterX

                Canvas(
                    modifier = Modifier
                        .pointerInput(maxX - minX, maxY - minY) {
                            detectTapGestures(
                                onTap = { tapOffset ->
                                    Log.d("roomInfo", room.roomInfo.classroom)
                                    if ((minX.toPx() <= tapOffset.x && maxX.toPx() >= tapOffset.x) && (minY.toPx() <= tapOffset.y && maxY.toPx() >= tapOffset.y)) {
                                        roomInfo = room.roomInfo
                                        state.value = true
                                    }
                                }
                            )
                        }
                        .align(Alignment.Center)
                        .fillMaxSize(),
                ) {
                        val path = Path()
                        val startPair = room.vertex[0]
                        path.moveTo(
                            (screenCenterX + startPair.first).toPx(),
                            (screenCenterY + startPair.second).toPx()
                        )
                        for (i in 1 until room.vertex.size) {
                            val cord = room.vertex[i]
                            path.lineTo(
                                (screenCenterX + cord.first).toPx(),
                                (screenCenterY + cord.second).toPx()
                            )
                        }
                        path.close()
                        drawPath(path, PrimaryBlue, style = Stroke(width = 10f))

                    }
                }
            }
        }

    if (state.value) {
        MeetingRoomInfoDialog(
            roomInfo = roomInfo,
            onReservationClick = {},
            onReservedClick = {},
            onDismiss = { state.value = false })
    }
}

//@Preview
//@Composable
//fun MapPreview() {
//    Map(Floor(
//        rooms = listOf(
//            RoomPosition(
//                x = (-85).dp,
//                y = (-138).dp,
//                height = 40.dp,
//                width = 60.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "1",
//                    classroom = "1303/1",
//                    classroomName = "П1",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-85).dp,
//                y = (-98).dp,
//                height = 40.dp,
//                width = 60.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "2",
//                    classroom = "1303/2",
//                    classroomName = "П2",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-85).dp,
//                y = (-60).dp,
//                height = 35.dp,
//                width = 60.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "3",
//                    classroom = "1303/3",
//                    classroomName = "П3",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-62).dp,
//                y = 25.dp,
//                height = 45.dp,
//                width = 34.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "4",
//                    classroom = "1303/4",
//                    classroomName = "П4",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-98).dp,
//                y = 25.dp,
//                height = 45.dp,
//                width = 34.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "5",
//                    classroom = "1303/5",
//                    classroomName = "П5",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-133).dp,
//                y = 25.dp,
//                height = 45.dp,
//                width = 34.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "6",
//                    classroom = "1303/6",
//                    classroomName = "П6",
//                    capacity = 4,
//                    daysOrderBefore = 0,
//                    isEquipment = false,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
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
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            ),
//            RoomPosition(
//                x = (-45).dp,
//                y = (126).dp,
//                height = 78.dp,
//                width = 37.dp,
//                roomInfo = UiMeetingRoomInfo(
//                    id = "8",
//                    classroom = "1303/8",
//                    classroomName = "Медиазона",
//                    capacity = 80,
//                    daysOrderBefore = 0,
//                    isEquipment = true,
//                    occupation = listOf(),
//                    responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
//                )
//            )
//        ),
//        image = R.drawable.lomo_map
//    ))
//}