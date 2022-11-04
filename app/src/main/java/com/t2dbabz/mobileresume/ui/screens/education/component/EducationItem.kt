package com.t2dbabz.mobileresume.ui.screens.education.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.t2dbabz.mobileresume.domain.model.Education


@Composable
fun EducationItem(education: Education) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.surface)
        .padding(8.dp)) {
        Row(modifier = Modifier.wrapContentSize()) {
            Image(painter = painterResource(id = education.schoolLogo), contentDescription = "Company Logo", modifier =
            Modifier.size(40.dp))

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(text = education.school,  style = MaterialTheme.typography.subtitle1, fontWeight = FontWeight.Bold)

                Text(text = education.course,  style = MaterialTheme.typography.subtitle2)

                Text(text = "${education.startDate} - ${education.endDate}",  style = MaterialTheme.typography.subtitle2)
            }
        }

    }
}