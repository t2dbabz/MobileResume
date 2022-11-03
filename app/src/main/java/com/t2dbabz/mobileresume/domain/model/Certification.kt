package com.t2dbabz.mobileresume.domain.model

import androidx.annotation.DrawableRes

data class Certification(
    val title: String,
    val organisation: String,
    val dateObtained: String,
    val certificateLink: String,
    @DrawableRes val organisationLogo: Int,
)
