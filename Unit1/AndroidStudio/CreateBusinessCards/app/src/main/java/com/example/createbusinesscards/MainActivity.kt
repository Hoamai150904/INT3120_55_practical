package com.example.myapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.createbusinesscards.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.createbusinesscards.ui.theme.CreateBusinessCardsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CreateBusinessCardsTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserProfileScreen()
                }
            }
        }
    }
}

@Composable
fun UserProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        HeaderSection()


        ContactInfoSection()
    }
}

@Composable
fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        // Profile Image
        Image(
            painter = painterResource(id = R.drawable.ic_profile),

            contentDescription = "Profile Image",
            modifier = Modifier.size(64.dp)
        )

        // Name and Title
        Column(
            modifier = Modifier
                .padding(start = 16.dp)
                .weight(1f)
        ) {
            Text(
                text = "Hoa Mai",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "Software Developer",
                fontSize = 16.sp
            )
        }
    }
}

@SuppressLint("ResourceType")
@Composable
fun ContactInfoSection() {
    Column(
        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        // Phone
        Row {
            Icon(
                painter = painterResource(id = R.string.ic_phone),
                contentDescription = "Phone Icon",
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "+123 456 7890")
        }

        // Email
        Row {
            Icon(
                painter = painterResource(R.string.ic_email),
                contentDescription = "Email Icon",
                tint = Color(0xFF3ddc84)
            )
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = "john.doe@example.com")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun UserProfilePreview() {
    CreateBusinessCardsTheme {
        UserProfileScreen()
    }
}