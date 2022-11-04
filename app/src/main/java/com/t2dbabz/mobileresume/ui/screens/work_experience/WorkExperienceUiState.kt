package com.t2dbabz.mobileresume.ui.screens.work_experience

import com.t2dbabz.mobileresume.data.LocalDataSource
import com.t2dbabz.mobileresume.domain.model.WorkExperience

data class WorkExperienceUiState(
    val workExperiences: List<WorkExperience> = LocalDataSource.workExperiences
)
