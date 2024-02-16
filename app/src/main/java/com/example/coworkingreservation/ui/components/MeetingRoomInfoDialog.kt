package com.example.coworkingreservation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.coworkingreservation.R
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo
import com.example.coworkingreservation.ui.theme.Black
import com.example.coworkingreservation.ui.theme.CoworkingReservationTheme
import com.example.coworkingreservation.ui.theme.Gray80
import com.example.coworkingreservation.ui.theme.LocalDimensions
import com.example.coworkingreservation.ui.theme.SemiBoldOpenSans16
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MeetingRoomInfoDialog(
    roomInfo: UiMeetingRoomInfo,
    onReservationClick: (roomInfo: UiMeetingRoomInfo) -> Unit,
    onReservedClick: (roomInfo: UiMeetingRoomInfo) -> Unit,
    onDismiss: () -> Unit,
    modifier: Modifier = Modifier
) {
    val dimensions = LocalDimensions.current
    val sheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true)

    val coroutineScope = rememberCoroutineScope()
    val hideModalBottomSheet: () -> Unit = {
        coroutineScope.launch {
            sheetState.hide()
            onDismiss()
        }
    }

    ModalBottomSheet(
        modifier = modifier,
        onDismissRequest = hideModalBottomSheet,
        dragHandle = {},
        sheetState = sheetState,
        shape = RoundedCornerShape(
            topStart = dimensions.modalCornerRadius,
            topEnd = dimensions.modalCornerRadius
        )
    ) {
        Column(modifier = Modifier.padding(
            vertical = dimensions.verticalDialog,
            horizontal = dimensions.horizontalDialog
        )) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.room_info),
                    style = SemiBoldOpenSans16,
                    color = Black
                )
                IconButton(
                    onClick = hideModalBottomSheet
                ) {
                    Icon(
                        modifier = Modifier.size(dimensions.iconDefaultSize),
                        imageVector = Icons.Filled.Close,
                        contentDescription = null,
                        tint = Gray80
                    )
                }
            }
            Spacer(modifier = Modifier.height(dimensions.verticalDialog))
            TextWithTitle(
                titleText = stringResource(R.string.room_name),
                bodyText = "${roomInfo.classroom} \"${roomInfo.classroomName}\""
            )
            Spacer(modifier = Modifier.height(dimensions.verticalDialog))
            TextWithTitle(
                titleText = stringResource(R.string.capacity),
                bodyText = stringResource(R.string.num_people, roomInfo.capacity)
            )
            Spacer(modifier = Modifier.height(dimensions.verticalDialog))
            TextWithTitle(
                titleText = stringResource(R.string.equipment),
                bodyText = stringResource(if (roomInfo.isEquipment) R.string.in_stock else R.string.not_in_stock)
            )
            Spacer(modifier = Modifier.height(dimensions.verticalDialog))
            TextWithTitle(
                titleText = stringResource(R.string.days_before_reservation),
                bodyText = stringResource(R.string.day, roomInfo.daysOrderBefore)
            )
            Spacer(modifier = Modifier.height(dimensions.verticalDialog))
            TextWithTitle(
                titleText = stringResource(R.string.responsible),
                bodyText = roomInfo.responsible.first()
            )
            Spacer(modifier = Modifier.height(dimensions.verticalMedium))
            PrimaryButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(R.string.reserve),
                onButtonClick = { onReservationClick(roomInfo) }
            )
            Spacer(modifier = Modifier.height(dimensions.verticalTiny))
            SecondaryButton(
                modifier = Modifier.fillMaxWidth(),
                text = stringResource(R.string.reservation_info),
                onButtonClick = { onReservedClick(roomInfo) }
            )
        }
    }
}

@Preview
@Composable
fun MeetingRoomInfoPreview() {
    CoworkingReservationTheme {
        val roomInfo = UiMeetingRoomInfo(
        id = "1",
        capacity = 80,
        classroom = "1301/8",
        classroomName = "Медиазона",
        daysOrderBefore = 0,
        isEquipment = true,
        occupation = listOf(),
        responsible = listOf("Фамилия Имя Отчество", "Фамилия Имя Отчество")
        )

        MeetingRoomInfoDialog(
            roomInfo = roomInfo,
            onReservationClick = {},
            onDismiss = { /*TODO*/ },
            onReservedClick = {}
        )
    }
}