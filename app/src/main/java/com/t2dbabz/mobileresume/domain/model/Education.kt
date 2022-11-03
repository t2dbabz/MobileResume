package com.t2dbabz.mobileresume.domain.model

import androidx.annotation.DrawableRes

data class Education(
    val school : String,
    val course: String,
    val startDate: String,
    val endDate: String,
    val certificateLink: String?,
    @DrawableRes val schoolLogo: Int
)
