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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.coworkingreservation.R
import com.example.coworkingreservation.ui.components.LocationCard
import com.example.coworkingreservation.ui.components.ToolBar
import com.example.coworkingreservation.ui.navigation.Graph
import com.example.coworkingreservation.ui.theme.CoworkingReservationTheme

@Composable
fun ChooseLocationScreen(navHostController: NavHostController) {
    val coworks = listOf(
        R.string.lomo_cowork,
        R.string.kronv_cowork,
        R.string.so_cowork,
        R.string.yandex_portal,
        R.string.birzha_rooms
    )
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
                items = coworks
            ) { item ->
                LocationCard(
                    cardText = stringResource(item),
                    onClick = {
                        navHostController.navigate(Graph.MAP + "?id=${coworks.indexOf(item) + 1}")
                    }
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MenuPreview() {
    CoworkingReservationTheme {
        ChooseLocationScreen(navHostController = rememberNavController())
    }
}