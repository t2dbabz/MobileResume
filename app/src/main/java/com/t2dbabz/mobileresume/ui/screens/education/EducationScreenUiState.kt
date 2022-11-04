package com.t2dbabz.mobileresume.ui.screens.education

import com.t2dbabz.mobileresume.data.LocalDataSource
import com.t2dbabz.mobileresume.domain.model.Certification
import com.t2dbabz.mobileresume.domain.model.Education

data class EducationScreenUiState(
    val education: List<Education> = LocalDataSource.education,
    val certifications: List<Certification> = LocalDataSource.certifications
)
