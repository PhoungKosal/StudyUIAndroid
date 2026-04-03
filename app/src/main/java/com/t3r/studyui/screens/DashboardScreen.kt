package com.t3r.studyui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun DashboardScreen(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp)
    ) {
//        Text(
//            text = "Welcome to the Dashboard, $name!",
//            modifier = Modifier.fillMaxSize(),
//            textAlign = TextAlign.Center
//        )
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Welcome to the Dashboard, $name!",
                textAlign = TextAlign.Center)

            Text(
                text = "This is where you can find all your important information and updates.",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}