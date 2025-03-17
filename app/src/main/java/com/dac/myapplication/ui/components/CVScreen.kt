package com.dac.myapplication.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CVScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item { ProfileSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { AboutMeSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { EducationSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { ProjectsSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }
        item { SkillsSection() }
    }
}
