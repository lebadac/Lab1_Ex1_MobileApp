package com.dac.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Color

// MainActivity: The main activity of the application, sets up the primary UI
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

// CVScreen: The primary UI screen of the CV, containing Profile, About Me, Experience, Projects, and Skills sections
@Composable
fun CVScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ProfileSection() // Profile section of the CV
        }
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Spacing between sections
        }
        item {
            AboutMeSection() // About Me section of the CV
        }
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Spacing between sections
        }
        item {
            ExperienceSection() // Experience section of the CV
        }
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Spacing between sections
        }
        item {
            ProjectsSection() // Projects section of the CV
        }
        item {
            Spacer(modifier = Modifier.height(16.dp)) // Spacing between sections
        }
        item {
            SkillsSection() // Skills section of the CV
        }
    }
}

// ProfileSection: The Profile section of the CV, containing the user's name and profile picture
@Composable
fun ProfileSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier.weight(1f)
            ) {
                Text(
                    text = "Le Ba Dac",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Text(
                    text = "IT Internship",
                    fontSize = 16.sp,
                    color = Color(0xFF5d8aa8)
                )
            }
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = "Profile Picture",
                modifier = Modifier.size(120.dp).padding(start = 16.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

// AboutMeSection: The About Me section of the CV, containing personal information and comments
@Composable
fun AboutMeSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "About Me",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Divider(
                color = Color(0xFF4997D0), // Divider color
                thickness = 2.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "I'm a fourth-year student from Information Systems at UIT-VNUHCM. Looking for a job related to Data Science and Machine Learning.",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

// ExperienceSection: The Experience section of the CV, containing education and experience information
@Composable
fun ExperienceSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Education",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Divider(
                color = Color(0xFF4997D0), // Divider color
                thickness = 2.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "Major: Information System, UIT VNU-HCM (2019 - 2024)",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

// ProjectsSection: The Projects section of the CV, containing a list of completed projects
@Composable
fun ProjectsSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Projects",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Divider(
                color = Color(0xFF4997D0), // Divider color
                thickness = 2.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "- Fire Detection System using Deep Learning",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "- Web Defacement Detection with Machine Learning",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "- Aspect-based Sentiment Analysis on Smartphone Reviews",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}

// SkillsSection: The Skills section of the CV, containing a list of skills
@Composable
fun SkillsSection() {
    Card(
        modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = RoundedCornerShape(16.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Skills",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            Divider(
                color = Color(0xFF4997D0), // Divider color
                thickness = 2.dp,
                modifier = Modifier.padding(vertical = 8.dp)
            )
            Text(
                text = "- Programming Languages: Python, Java, C++",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "- Frameworks: TensorFlow, PyTorch, React",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "- Tools: Git, Docker, Kubernetes",
                fontSize = 16.sp,
                modifier = Modifier.padding(top = 4.dp)
            )
        }
    }
}