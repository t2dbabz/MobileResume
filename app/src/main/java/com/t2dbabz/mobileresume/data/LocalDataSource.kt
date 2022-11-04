package com.t2dbabz.mobileresume.data

import com.t2dbabz.mobileresume.R
import com.t2dbabz.mobileresume.domain.model.*

object LocalDataSource {

    private val socialMediaAccounts = listOf<SocialMediaAccount>(
        SocialMediaAccount("Twitter", "https://twitter.com/tundedon", R.drawable.twitter),
        SocialMediaAccount("Linkedin", "https://linkedin.com/in/babatunde-owoleke", R.drawable.linkedin),
        SocialMediaAccount("Github", "https://github.com/t2dbabz", R.drawable.github),
        SocialMediaAccount("Gmail", "tundeowoleke1@gmail.com", R.drawable.gmail),
        SocialMediaAccount("Phone", "+2348035909842", R.drawable.telephone),
    )

    private val interests = listOf(
        "Software Development", "Video Games", "Reading Tech Articles", "Computer and Information Technology"
    )

    private val skills = listOf<Skill>(
        Skill("Programming Languages", listOf("Kotlin", "Java", "XML")),
        Skill("Android Technologies/Libraries", listOf("Jetpack Compose", "Retrofit", "Room", "Dagger Hilt",
            "Mockito", "Clean Architecture", "MVVM")),
        Skill("Framework/Tools", listOf("Android SDK", "Firebase", "Git", "Github","Material Design", "Figma")),
        Skill("Soft Skills", listOf("Teamwork", "Communication", "Critical Thinking"))
    )

    val aboutMe = AboutMe(
        name = "Babatunde Owoleke",
        profileImage = R.drawable.profile_pic,
        jobTitle = "Android Developer",
        summary = "I'm an Electrical Engineer with passion for Android Development. I love building personlised apps with good UI/UX, good development practices and great attention to detail.\n" +
                "I am so passionate about learning new tools and modern technologies in Android and employing them to build amazing mobile experiences"
        ,
        location = "Abuja, Nigeria",
        email = "tundeowoleke1@gmail.com",
        phoneNumber = "+2348035909842",
        socialMediaAccounts =  socialMediaAccounts,
        skills = skills,
        interests = interests ,
    )


    val workExperiences = listOf<WorkExperience>(
        WorkExperience(
            jobTitle = "Senior Electrical Engineer",
            company = "Ajaokuta Steel Company Limited (ASCL)",
            jobType = "Permanent",
            startDate = "Jan 2019",
            endDate = "Present",
            achievements = listOf(
                "Observe voltage transformers and circuit breakers in the transmission substation and prepare weekly reports on the activities at the 132kv transmission substation",
                "Collaborate with engineers, planners, field personnel, or other utility workers to provide critical information such as clearances, switching orders, or distribution process changes",
                "Ensure that planning, scheduling, and unscheduled repairs are carried out efficiently, with reduced cost, and with quality service",
            ),
            companyLogo = R.drawable.asco
        ),

        WorkExperience(
            jobTitle = "Android Developer Intern",
            company = "Zuri Team Inc",
            jobType = "Internship",
            startDate = "Mar 2021",
            endDate = "Jun 2021",
            achievements = listOf(
                "Collaborated with a team consisting of designers and software developers to develop a digital Inventory solution named ‘Stocka’",
                "Led an android team of (2) to develop the android application using kotlin and various jetpack " +
                        "libraries",
                "Implemented the core features of the app and improved the overall experience based on the feedback " +
                        "from the users of the app",
            ),
            companyLogo = R.drawable.zuri_image
        ),

        WorkExperience(
            jobTitle = "Intern",
            company = "National Defence College",
            jobType = "NYSC",
            startDate = "May 2017",
            endDate = "Apr 2018",
            achievements = listOf(
                "Conducted various routine maintenance tests to improve the efficiency of electrical and security " +
                        "installations within college premises.",
            "Performed in-depth electrical acceptance testing of completed hardware, including continuity and " +
                    "highpotential isolation testing",
                "Determined the most effective approaches to new projects by reading and analyzing blueprints, " +
                        "drawings, and sketches"
            ),
            companyLogo = R.drawable.ndc_logo
        )
    )

    val education = listOf(
        Education(
            school = "Federal University of Technology, Minna",
            course = "Bachelor of Engineering; Electrical/Electronic Engineering",
            startDate = "Dec 2010",
            endDate = "Oct 2016",
            certificateLink = null,
            schoolLogo = R.drawable.futminna_logo
        ),
        Education(
            school = "Udacity",
            course = "Android Kotlin Developer Nanodegree",
            startDate = "Nov 2021",
            endDate = "Mar 2022",
            certificateLink = null,
            schoolLogo = R.drawable.udacity_image
        ),
    )

    val certifications = listOf(
        Certification(
            title = "Associate Android Developer",
            organisation = "Google",
            dateObtained = "Apr 2022",
            certificateLink = "https://www.credential" +
                    ".net/2ac9af3e-06e6-4fb1-bc0d-b00a6a3f9e49?key=8774ac85cf93192c69d2d62b9156ef2d2400b16b573e844fce7820d016193a45",
            organisationLogo = R.drawable.google_image
        ),

        Certification(
            title = "Google Africa Developer Scholarship 2021 Certificate of Completion",
            organisation = "Google Developers",
            dateObtained = "May 2022",
            certificateLink = "https://adscerts.com/scholar/E105FC2DFEA25D6",
            organisationLogo = R.drawable.google_developer
        ),

        Certification(
            title = "Android Kotlin Developer Nanodegree",
            organisation = "Udacity",
            dateObtained = "Mar 2022",
            certificateLink = "https://confirm.udacity.com/LFCPFLFD",
            organisationLogo = R.drawable.udacity_image
        ),
        Certification(
            title = "Android Jetpack Compose: The Comprehensive Bootcamp",
            organisation = "Udemy",
            dateObtained = "Aug 2022",
            certificateLink = "https://www.udemy.com/certificate/UC-02d39a8c-bc72-4dec-b521-876efe975c0",
            organisationLogo = R.drawable.udemy_image
        )
    )


}