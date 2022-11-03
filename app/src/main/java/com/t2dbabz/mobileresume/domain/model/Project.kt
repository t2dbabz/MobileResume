package com.t2dbabz.mobileresume.domain.model

data class Project(
    val projectName: String,
    val projectDescription: String,
    val projectLink: String,
    val projectTools: List<String>
)
