package com.t2dbabz.mobileresume.ui.screens.education.component


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.t2dbabz.mobileresume.domain.model.Certification
import com.t2dbabz.mobileresume.R



@Composable
fun CertificationItem(certification: Certification, onClickShowCredential: (String) -> Unit) {
    Column(modifier = Modifier
        .fillMaxWidth()
        .background(MaterialTheme.colors.surface)
        .padding(8.dp)) {
        Row(modifier = Modifier.wrapContentSize()) {
            Image(painter = painterResource(id = certification.organisationLogo), contentDescription = "Company Logo", modifier =
            Modifier.size(40.dp))

            Column(modifier = Modifier.padding(start = 10.dp)) {
                Text(text = certification.title,  style = MaterialTheme.typography.subtitle1, fontWeight = FontWeight.Bold)

                Text(text = certification.organisation,  style = MaterialTheme.typography.subtitle2)
                Text(text = "Issued:  ${certification.dateObtained}",  style = MaterialTheme.typography.subtitle2)

                Spacer(modifier = Modifier.height(8.dp))

                Row(modifier = Modifier
                    .border(width = 0.75.dp, color = Color.Black, shape = RoundedCornerShape(24.dp))
                    .clickable {
                          onClickShowCredential(certification.certificateLink)
                    }
                    , verticalAlignment = Alignment.CenterVertically){
                    Text(text = "Show Credential", modifier = Modifier.padding(4.dp), style = MaterialTheme.typography.caption)
                    Icon(painter = painterResource(id = R.drawable.ic_open_in), contentDescription = "Share", modifier =
                    Modifier
                        .size(16.dp)
                        .padding(end = 4.dp))
                }
            }

        }

    }
}