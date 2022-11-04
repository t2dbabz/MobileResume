package com.t2dbabz.mobileresume.ui.screens.education

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.core.content.ContextCompat
import androidx.lifecycle.viewmodel.compose.viewModel
import com.ramcosta.composedestinations.annotation.Destination
import com.t2dbabz.mobileresume.ui.screens.education.component.CertificationItem
import com.t2dbabz.mobileresume.ui.screens.education.component.EducationItem
import com.t2dbabz.mobileresume.R

@Destination
@Composable
fun EducationScreen(viewModel: EducationViewModel = viewModel()) {
    val state by viewModel.state
    val context = LocalContext.current
    Box(modifier = Modifier.fillMaxSize()){
        LazyColumn(contentPadding = PaddingValues(8.dp)) {
            item {
                Text(text = stringResource(id = R.string.education), style = MaterialTheme.typography.subtitle1,
                    fontWeight =
                FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp))
            }

            items(state.education) {
                EducationItem(it)
            }

            item {
                Text(text = stringResource(id = R.string.certifications),style = MaterialTheme.typography.subtitle1, fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(vertical = 8.dp))
            }

            items(state.certifications) { certification ->
                CertificationItem(certification){ link ->
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(link))
                    ContextCompat.startActivity(context, intent, null)
                }
            }
        }
    }
}