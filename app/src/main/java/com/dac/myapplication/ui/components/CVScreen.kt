package com.dac.myapplication.ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

/**
 * CVScreen displays a vertical list of sections that make up a resume/CV.
 * Each section is represented as a separate composable.
 */
@Composable
fun CVScreen() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Profile section with basic information
        item { ProfileSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }

        // About Me section with a brief introduction
        item { AboutMeSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }

        // Education section
        item { EducationSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }

        // Projects section listing important work
        item { ProjectsSection() }
        item { Spacer(modifier = Modifier.height(16.dp)) }

        // Skills section displaying technical competencies
        item { SkillsSection() }
    }
}
