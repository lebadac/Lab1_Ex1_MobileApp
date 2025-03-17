package com.dac.myapplication.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight

/**
 * SkillsSection displays a list of technical skills with a title and a blue underline.
 */
@Composable
fun SkillsSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF3E5F5)) // Background color
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Skills", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            // Blue underline below the title
            Canvas(modifier = Modifier.fillMaxWidth().height(2.dp)) {
                drawRect(color = Color(0xFF2196F3)) // Blue color
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "- Kotlin\n- Jetpack Compose\n- Machine Learning\n- Python\n- TensorFlow & PyTorch")
        }
    }
}

