package com.example.coworkingreservation.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coworkingreservation.R
import com.example.coworkingreservation.config
import com.example.coworkingreservation.domain.models.MeetingRoomViewModel
import com.example.coworkingreservation.ui.components.TextBadge
import com.example.coworkingreservation.ui.components.Map
import com.example.coworkingreservation.ui.navigation.Graph
import com.example.coworkingreservation.ui.theme.Gray12
import com.example.coworkingreservation.ui.theme.LocalDimensions


@Composable
fun MapScreen(
    navHostController: NavHostController,
    mapId: Int,
    meetingRoomViewModel: MeetingRoomViewModel
) {
    var textBadge by remember { mutableStateOf("") }
    val dimensions = LocalDimensions.current

    when (mapId) {
        1 -> textBadge = stringResource(R.string.lomo_cowork)
        2 -> textBadge = stringResource(R.string.kronv_cowork)
        3 -> textBadge = stringResource(R.string.so_cowork)
        4 -> textBadge = stringResource(R.string.yandex_portal)
        5 -> textBadge = stringResource(R.string.birzha_rooms)
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Gray12),
        contentAlignment = Alignment.Center
    ) {
        config[mapId]?.let {
            Map(
                floor = it,
                navHostController = navHostController,
                meetingRoomViewModel = meetingRoomViewModel
            )
        }
        TextBadge(
            modifier = Modifier
                .align(Alignment.TopStart)
                .padding(dimensions.badgePadding),
            text = textBadge,
            onClick = { navHostController.navigate(Graph.ROOT) }
        )
    }
}


@Preview
@Composable
fun MapScreenPreview() {
    MapScreen(
        navHostController = rememberNavController(),
        mapId = 1,
        meetingRoomViewModel = MeetingRoomViewModel()
    )
}