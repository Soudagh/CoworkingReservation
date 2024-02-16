package com.example.coworkingreservation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.coworkingreservation.R
import com.example.coworkingreservation.domain.models.UiMeetingRoomInfo
import com.example.coworkingreservation.ui.components.TextWithTitle
import com.example.coworkingreservation.ui.theme.LocalDimensions

@Composable
fun ReservationScreen(roomInfo: UiMeetingRoomInfo) {
    val dimensions = LocalDimensions.current
    Column(modifier = Modifier.padding(dimensions.defaultPadding)) {
        TextWithTitle(
            titleText = stringResource(R.string.room_name),
            bodyText = "${roomInfo.classroom} \"${roomInfo.classroomName}\""
        )
        Spacer(modifier = Modifier.height(dimensions.verticalSmall))

    }
}