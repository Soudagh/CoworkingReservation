package com.example.coworkingreservation.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.components.LocationCard
import com.example.coworkingreservation.ui.components.ToolBar
import com.example.coworkingreservation.ui.theme.CoworkingReservationTheme

@Composable
fun ChooseLocationScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
    ) {
        ToolBar(
            titleText = stringResource(id = R.string.choose_coworking_location),
            onNavigationIconClick = {}
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            modifier = Modifier
                .fillMaxHeight()
                .padding(24.dp)

        ) {
            items(
                items = listOf(
                    R.string.kronv_cowork,
                    R.string.lomo_cowork,
                    R.string.so_cowork,
                    R.string.yandex_portal
                )
            ) { item ->
                LocationCard(cardText = stringResource(item), onClick = {})
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    CoworkingReservationTheme {
        ChooseLocationScreen()
    }
}