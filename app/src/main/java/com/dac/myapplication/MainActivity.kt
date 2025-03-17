package com.dac.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.ui.graphics.Color
import com.dac.myapplication.ui.components.CVScreen
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.fillMaxSize

/**
 * MainActivity serves as the entry point of the application.
 * It sets up the UI with a MaterialTheme and displays the CVScreen.
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFbcd4e6) // Background color
                ) {
                    CVScreen()
                }
            }
        }
    }
}
