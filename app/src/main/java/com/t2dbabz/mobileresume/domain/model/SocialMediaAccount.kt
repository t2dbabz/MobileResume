package com.t2dbabz.mobileresume.domain.model

import androidx.annotation.DrawableRes

data class SocialMediaAccount(
    val name: String,
    val profileLink: String,
    @DrawableRes val socialMediaImage: Int
)