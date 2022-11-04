package com.t2dbabz.mobileresume.ui.screens.about_me

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph

@RootNavGraph(start = true)
@Destination
@Composable
fun AboutMeScreen() {
    Box(modifier = Modifier.fillMaxSize()){
        Text(text = "About Me Screen")
    }
}