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
 * ProjectsSection displays a list of projects with a title and a blue underline.
 */
@Composable
fun ProjectsSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        elevation = CardDefaults.cardElevation(4.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF3E5F5)) // Background color
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Projects", fontSize = 20.sp, fontWeight = FontWeight.Bold)

            Canvas(modifier = Modifier.fillMaxWidth().height(2.dp)) {
                drawRect(color = Color(0xFF2196F3))
            }

            Spacer(modifier = Modifier.height(8.dp))
            Text(text = "1. Fire Detection using CNN\n2. Web Defacement Detection using ML")
        }
    }
}
