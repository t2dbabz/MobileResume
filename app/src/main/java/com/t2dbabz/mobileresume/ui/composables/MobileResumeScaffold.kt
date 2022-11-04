package com.t2dbabz.mobileresume.ui.composables

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.spec.Route
import com.t2dbabz.mobileresume.ui.screens.appCurrentDestinationAsState
import com.t2dbabz.mobileresume.ui.screens.destinations.Destination
import com.t2dbabz.mobileresume.ui.screens.startAppDestination

@Composable
fun MobileResumeScaffold(
    startRoute: Route,
    navController: NavHostController,
   topBar: @Composable (Destination, NavBackStackEntry?) -> Unit,
   bottomBar: @Composable (Destination) -> Unit,
    content: @Composable (PaddingValues) -> Unit,
) {
    val destination = navController.appCurrentDestinationAsState().value
        ?: startRoute.startAppDestination

    val navBackStackEntry = navController.currentBackStackEntry

    Scaffold(
        topBar = {
            topBar(destination, navBackStackEntry)
        },
        content = content,

        bottomBar = {
            bottomBar(destination)
        }
    )
}