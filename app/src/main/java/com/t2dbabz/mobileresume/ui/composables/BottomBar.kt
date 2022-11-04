package com.t2dbabz.mobileresume.ui.composables

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import com.ramcosta.composedestinations.navigation.navigate
import com.t2dbabz.mobileresume.R
import com.t2dbabz.mobileresume.ui.screens.NavGraphs
import com.t2dbabz.mobileresume.ui.screens.appCurrentDestinationAsState
import com.t2dbabz.mobileresume.ui.screens.destinations.*
import com.t2dbabz.mobileresume.ui.screens.startAppDestination

@Composable
fun BottomBar(
    navController: NavHostController
) {

    val currentDestination: Destination? = navController.appCurrentDestinationAsState().value
        ?: NavGraphs.root.startAppDestination

    BottomNavigation() {
        BottomBarItem.values().forEach { destination ->
            BottomNavigationItem(
                selected = currentDestination == destination.direction,
                onClick = {
                    navController.navigate(destination.direction) {
                        launchSingleTop = true
                    }
                },
                icon = {
                    Icon(
                    painter = painterResource(id = destination.icon),
                    contentDescription = stringResource(id = destination.label))},
                label = { Text(text = stringResource(id = destination.label))}
            )
        }
    }
}


enum class BottomBarItem(
    val direction: DirectionDestination,
    @DrawableRes val icon: Int,
    @StringRes val label: Int
) {
    AboutMe(AboutMeScreenDestination, R.drawable.about_me, R.string.about_me),
    Experience(WorkExperienceDestination, R.drawable.work_experience, R.string.work_experience),
    Education(EducationScreenDestination, R.drawable.education, R.string.education)
}



