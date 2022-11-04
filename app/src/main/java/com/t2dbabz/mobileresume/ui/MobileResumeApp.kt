package com.t2dbabz.mobileresume.ui

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.google.accompanist.navigation.material.ExperimentalMaterialNavigationApi
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.animations.rememberAnimatedNavHostEngine
import com.t2dbabz.mobileresume.ui.composables.BottomBar
import com.t2dbabz.mobileresume.ui.composables.MobileResumeScaffold
import com.t2dbabz.mobileresume.ui.composables.TopBar
import com.t2dbabz.mobileresume.ui.screens.NavGraphs

@OptIn(ExperimentalAnimationApi::class, ExperimentalMaterialNavigationApi::class)
@Composable
fun MobileResumeApp() {

    val engine = rememberAnimatedNavHostEngine()
    val navController = engine.rememberNavController()

    MobileResumeScaffold(
        startRoute = NavGraphs.root.startRoute,
        navController = navController,
        topBar = {destination, navBackStackEntry -> TopBar(destination, navBackStackEntry)},
        bottomBar = {destination -> BottomBar(navController = navController)}
    ) {
        DestinationsNavHost(
            engine = engine,
            navController = navController,
            navGraph = NavGraphs.root,
            modifier = Modifier.padding(it),
            startRoute = NavGraphs.root.startRoute
        )
    }

}