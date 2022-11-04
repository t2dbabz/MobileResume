package com.t2dbabz.mobileresume.ui.screens.work_experience

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import androidx.lifecycle.viewmodel.compose.viewModel
import com.t2dbabz.mobileresume.ui.screens.work_experience.component.WorkExperienceItem

@Destination
@Composable
fun WorkExperience(viewModel: WorkExperienceViewModel = viewModel()) {
    val state by viewModel.state
    Box(modifier = Modifier.fillMaxSize()){
        LazyColumn(contentPadding = PaddingValues(8.dp)) {
            items(state.workExperiences){
                WorkExperienceItem(workExperience = it)
            }
        }
    }
}