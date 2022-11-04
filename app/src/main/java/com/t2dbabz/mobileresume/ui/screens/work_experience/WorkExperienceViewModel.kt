package com.t2dbabz.mobileresume.ui.screens.work_experience

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class WorkExperienceViewModel(): ViewModel() {
    private  val _state = mutableStateOf(WorkExperienceUiState())
    val state: State<WorkExperienceUiState> = _state
}