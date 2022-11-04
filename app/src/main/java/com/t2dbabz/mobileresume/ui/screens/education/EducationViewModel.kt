package com.t2dbabz.mobileresume.ui.screens.education

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class EducationViewModel(): ViewModel() {
    private val _state = mutableStateOf(EducationScreenUiState())
    val state: State<EducationScreenUiState> = _state
}