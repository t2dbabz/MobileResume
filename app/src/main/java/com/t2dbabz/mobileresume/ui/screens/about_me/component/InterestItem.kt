package com.t2dbabz.mobileresume.ui.screens.about_me.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow

@Composable
fun InterestItem(modifier: Modifier = Modifier, interests: List<String>) {
    FlowRow(mainAxisSpacing = 10.dp, crossAxisSpacing = 10.dp, modifier = modifier.fillMaxWidth()) {
        interests.forEach { interest ->
            Tag(tag = interest)
        }
    }
}