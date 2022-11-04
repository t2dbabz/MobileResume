package com.t2dbabz.mobileresume.ui.screens.work_experience.component

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
import com.t2dbabz.mobileresume.domain.model.WorkExperience

@Composable
fun WorkExperienceItem(workExperience: WorkExperience) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.surface)
        .padding(8.dp)) {
        Row(modifier = Modifier.wrapContentSize()) {
           Image(painter = painterResource(id = workExperience.companyLogo), contentDescription = "Company Logo", modifier =
           Modifier.size(40.dp))

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(text = workExperience.jobTitle, style = MaterialTheme.typography.subtitle1, fontWeight = FontWeight.Bold)
                Row {
                  Text(text = workExperience.company, style = MaterialTheme.typography.subtitle2)
                }
                Text(text = workExperience.jobType, style = MaterialTheme.typography.subtitle2)
                Text(text = "${workExperience.startDate} - ${workExperience.endDate}",  style = MaterialTheme.typography.subtitle2)
            }
        }


        Column(modifier = Modifier.fillMaxWidth().padding(top = 8.dp)) {
         workExperience.achievements.forEach {
                Row(modifier = Modifier.padding(4.dp)){
                    Spacer(modifier = Modifier.width(40.dp))
                    Text(text = "·", modifier = Modifier.padding(horizontal = 4.dp ))
                    Text(text = it, style = MaterialTheme.typography.body2)
                }
            }

        }
    }
}