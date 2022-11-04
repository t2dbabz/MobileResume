package com.t2dbabz.mobileresume.ui.composables

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import com.t2dbabz.mobileresume.ui.screens.destinations.AboutMeScreenDestination
import com.t2dbabz.mobileresume.ui.screens.destinations.Destination
import com.t2dbabz.mobileresume.ui.screens.destinations.EducationScreenDestination
import com.t2dbabz.mobileresume.ui.screens.destinations.WorkExperienceDestination

@Composable
fun TopBar(
    destination: Destination,
    navBackStackEntry: NavBackStackEntry?
) {

    TopAppBar {
        Spacer(Modifier.width(8.dp))

        Text(
            text = destination.topBarTitle(navBackStackEntry),
            fontWeight = FontWeight.ExtraBold,
            fontSize = 20.sp
        )
    }
}

@Composable
fun Destination.topBarTitle(navBackStackEntry: NavBackStackEntry?): String {
    return when (this) {

      AboutMeScreenDestination,
      EducationScreenDestination,
      WorkExperienceDestination -> javaClass.simpleName.removeSuffix("Destination")

    }
}