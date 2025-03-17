package com.dac.myapplication.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/**
 * EducationSection displays the educational background of the user.
 * It includes a title, a blue underline, and details about the major and university.
 */
@Composable
fun EducationSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF3E5F5))
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "Education",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Spacer(modifier = Modifier.height(4.dp))
            Canvas(modifier = Modifier.fillMaxWidth().height(2.dp)) {
                drawRect(color = Color(0xFF2196F3)) // Blue underline
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Major: Information System, UIT VNU-HCM (2021-2026)",
                fontSize = 16.sp
            )
        }
    }
}
