package com.t2dbabz.mobileresume.ui.screens.about_me.component

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.google.accompanist.flowlayout.FlowRow
import com.t2dbabz.mobileresume.domain.model.Skill

@Composable
fun SkillItem(modifier: Modifier = Modifier, skill: Skill) {
    var isExpanded by remember { mutableStateOf(false) }
    Column(modifier = modifier
        .fillMaxWidth()
        .border(width = 1.dp, color = MaterialTheme.colors.onSurface, shape = RoundedCornerShape(12.dp))
        .background(MaterialTheme.colors.surface)
        .clickable {

            isExpanded = !isExpanded
        }
    ) {
        Row(modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {
            Text(text = skill.categoryName, modifier = Modifier.weight(.8f), style = MaterialTheme.typography.subtitle2)
            Icon(imageVector = if (isExpanded) Icons.Default.KeyboardArrowUp else Icons.Default.KeyboardArrowDown,
                contentDescription = "Arrow" )
        }
        if (isExpanded) {
            Divider(modifier = Modifier.padding(bottom = 4.dp))
        }
        AnimatedVisibility(visible = isExpanded) {
            Column(modifier = Modifier.background(MaterialTheme.colors.surface).padding(4.dp)) {
                FlowRow(mainAxisSpacing = 10.dp, crossAxisSpacing = 10.dp, modifier = Modifier.fillMaxWidth()) {
                    skill.subCategories.forEach {
                        Tag(tag = it)
                    }

                }
            }
        }

    }
}