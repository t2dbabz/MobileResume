package com.t2dbabz.mobileresume.domain.model

import androidx.annotation.DrawableRes

data class WorkExperience(
    val jobTitle: String,
    val company: String,
    val jobType: String,
    val startDate: String,
    val endDate: String,
    val achievements: List<String>,
    @DrawableRes val companyLogo: Int,
)
