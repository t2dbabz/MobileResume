package com.t2dbabz.mobileresume.ui.screens.about_me.component

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun Tag(tag: String) {
    Box(modifier = Modifier
        .border(
            width = 1.dp,
            color = MaterialTheme.colors.onBackground,
            shape = RoundedCornerShape(100.dp)
        )
        .padding(8.dp)) {
        Text(
            text = tag,
            color = MaterialTheme.colors.onBackground,
            textAlign = TextAlign.Center,
            style = MaterialTheme .typography.body2
        )
    }
}