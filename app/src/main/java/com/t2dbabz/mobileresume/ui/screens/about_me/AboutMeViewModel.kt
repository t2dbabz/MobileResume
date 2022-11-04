package com.t2dbabz.mobileresume.ui.screens.about_me

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class AboutMeViewModel(): ViewModel() {
    private  val _state = mutableStateOf(AboutMeScreenUiState())
    val state: State<AboutMeScreenUiState> = _state
}