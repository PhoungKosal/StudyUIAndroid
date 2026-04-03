package com.t3r.studyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.t3r.studyui.screens.DashboardScreen
import com.t3r.studyui.screens.Greeting
import com.t3r.studyui.ui.theme.StudyUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyUITheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { Text("Dashboard") },
                    bottomBar = { Text("Bottom Navigation") }
                ) { innerPadding ->
                    DashboardScreen(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}