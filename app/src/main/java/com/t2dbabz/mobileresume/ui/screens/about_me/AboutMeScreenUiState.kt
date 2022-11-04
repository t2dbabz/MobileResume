package com.t2dbabz.mobileresume.ui.screens.about_me

import com.t2dbabz.mobileresume.data.LocalDataSource
import com.t2dbabz.mobileresume.domain.model.AboutMe

data class AboutMeScreenUiState(
    val aboutMe: AboutMe = LocalDataSource.aboutMe
)
