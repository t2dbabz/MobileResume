package com.t2dbabz.mobileresume.domain.model

import androidx.annotation.DrawableRes

data class AboutMe(
    val name: String,
    @DrawableRes val profileImage:Int,
    val jobTitle: String,
    val summary: String,
    val location: String,
    val email: String,
    val phoneNumber: String,
    val socialMediaAccounts: List<SocialMediaAccount>,
    val skills: List<Skill>,
    val interests: List<String>
)



