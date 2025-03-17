package com.dac.myapplication.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.font.FontWeight


@Composable
fun AboutMeSection() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFEDE7F6)) // Màu nền nhạt
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(
                text = "About Me",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )

            // Đường gạch màu xanh
            Divider(
                color = Color(0xFF1E88E5), // Màu xanh dương
                thickness = 2.dp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp)
            )

            Text(
                text = "I'm a fourth-year student from Information Systems at UIT-VNUHCM. " +
                        "Looking for a job related to Data Science and Machine Learning.",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

