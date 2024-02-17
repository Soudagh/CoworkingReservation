package com.example.coworkingreservation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import androidx.navigation.navigation
import com.example.coworkingreservation.domain.models.MeetingRoomViewModel
import com.example.coworkingreservation.ui.screens.ChooseLocationScreen
import com.example.coworkingreservation.ui.screens.MapScreen
import com.example.coworkingreservation.ui.screens.ReservationScreen

@Composable
fun RootNavGraph(navController: NavHostController) {
    val meetingRoomViewModel: MeetingRoomViewModel = viewModel()
    NavHost(
        navController = navController,
        startDestination = Graph.ROOT
    ) {
        composable(route = Graph.ROOT) {
            ChooseLocationScreen(navHostController = navController)
        }
        reservationNavGraph(navController = navController, meetingRoomViewModel)
        composable(
            route = Graph.MAP + "?id={id}",
            arguments = listOf(
                navArgument("id") {
                    type = NavType.IntType
                    defaultValue = 1
                    nullable = false
                }
            )
        ) { entry ->
            entry.arguments?.getInt("id")
                ?.let {
                    MapScreen(
                        navHostController = navController,
                        mapId = it,
                        meetingRoomViewModel = meetingRoomViewModel
                    )
                }
        }
    }
}


fun NavGraphBuilder.reservationNavGraph(
    navController: NavHostController,
    meetingRoomViewModel: MeetingRoomViewModel
) {
    navigation(
        startDestination = Graph.RESERVATION,
        route = Graph.MAP
    ) {
        composable(route = Graph.RESERVATION) {
            ReservationScreen(
                navHostController = navController,
                onNavigateUp = { navController.navigateUp() },
                meetingRoomViewModel = meetingRoomViewModel
            )
        }
    }
}


object Graph {
    const val ROOT = "root_graph"
    const val MAP = "map_graph"
    const val RESERVATION = "reservation_graph"
}