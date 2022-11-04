package com.t2dbabz.mobileresume.ui.screens.about_me

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.t2dbabz.mobileresume.R
import com.t2dbabz.mobileresume.domain.model.Skill
import com.t2dbabz.mobileresume.ui.screens.about_me.component.InterestItem
import com.t2dbabz.mobileresume.ui.screens.about_me.component.SkillItem
import com.t2dbabz.mobileresume.ui.util.dial
import com.t2dbabz.mobileresume.ui.util.sendMail

@RootNavGraph(start = true)
@Destination
@Composable
fun AboutMeScreen(viewModel: AboutMeViewModel = viewModel()) {
    val aboutMeData by viewModel.state

    val context = LocalContext.current
    Column (
        Modifier
            .fillMaxSize()
            .background(MaterialTheme.colors.background)
            .verticalScroll(rememberScrollState())
            ){



        Image(
            painter = painterResource(id = R.drawable.profile_pic),
            contentDescription = "Profile",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(top = 8.dp)
                .size(width = 75.dp, height = 75.dp)
                .clip(RoundedCornerShape(12.dp))
                .border(width = 2.dp, color = MaterialTheme.colors.onSurface, shape = RoundedCornerShape(12.dp))
                .align(CenterHorizontally)
        )


        Column(
            Modifier

        ) {
            Text(text = aboutMeData.aboutMe.name, style = MaterialTheme.typography.h6, modifier = Modifier.align
                (CenterHorizontally)
            )
            Text(text = aboutMeData.aboutMe.jobTitle, style = MaterialTheme.typography.subtitle1, modifier = Modifier
                .align
                    (CenterHorizontally)
                .padding(top = 4.dp)
            )

            Text(text = aboutMeData.aboutMe.summary, style = MaterialTheme.typography.caption, textAlign = TextAlign.Center,
                modifier = Modifier
                    .align(CenterHorizontally)
                    .padding(start = 16.dp, end = 16.dp, top = 12.dp)
            )

            Text(text = aboutMeData.aboutMe.location, style = MaterialTheme.typography.body2, modifier = Modifier
                .align
                    (CenterHorizontally)
                .padding(top = 4.dp)
            )

            Text(text = stringResource(id = R.string.contact), style = MaterialTheme.typography.subtitle1, modifier = Modifier.padding(start=16.dp, top
            = 8.dp), fontWeight = FontWeight.Bold)

            Row(modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
                for (socialMedia in aboutMeData.aboutMe.socialMediaAccounts) {
                   Image(
                       painter = painterResource(id = socialMedia.socialMediaImage),
                       contentDescription = socialMedia.name,
                       modifier = Modifier
                           .size(50.dp)
                           .padding(8.dp)
                           .clickable {

                               when (socialMedia.name) {
                                   "Twitter",
                                   "Linkedin",
                                   "Github" -> {
                                       val intent = Intent(Intent.ACTION_VIEW, Uri.parse(socialMedia.profileLink))
                                       startActivity(context, intent, null)
                                   }

                                   "Phone" -> {
                                       context.dial(aboutMeData.aboutMe.phoneNumber)
                                   }

                                   "Gmail" -> {
                                       context.sendMail(to = aboutMeData.aboutMe.email, "Hello Babatunde Owoleke")
                                   }
                               }
                           }

                   )
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp)
            .wrapContentSize()) {
            Text(text = stringResource(id = R.string.skills), style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 8.dp), fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

           Column(){
                aboutMeData.aboutMe.skills.forEach() { item: Skill ->
                    SkillItem(skill = item, modifier = Modifier.padding(top= 4.dp, bottom = 4.dp))
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 24.dp)
            .wrapContentSize()) {
            Text(text = stringResource(id = R.string.Interests), style = MaterialTheme.typography.subtitle1,
                modifier = Modifier.padding(top = 8.dp), fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

            Column(){
                InterestItem(interests =aboutMeData.aboutMe.interests )
            }
        }
    }


}