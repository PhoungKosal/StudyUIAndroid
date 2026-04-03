package com.t3r.studyui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.t3r.studyui.screens.Screen
import com.t3r.studyui.ui.theme.StudyUITheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            StudyUITheme {
                Scaffold{ paddingValues ->
                    Screen(
                        modifier = Modifier.padding(paddingValues)
                    )
                }
            }
        }
    }
}