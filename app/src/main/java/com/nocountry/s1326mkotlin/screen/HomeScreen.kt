package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nocountry.s1326mkotlin.R

@Composable
fun HomeScreen(navigateToLogin: () -> Unit) {
    Surface(color = Color(0xFF232023)) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.bienvenida_1),
                contentDescription = null,
                modifier = Modifier.size(150.dp)
            )
            Text(
                text = "Histopia",
                color = Color(0xFFE69DDD),
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(vertical = 24.dp)
                    .clickable { navigateToLogin() }
            )
            Image(
                painter = painterResource(id = R.drawable.bienvenida_2),
                contentDescription = null,
                modifier = Modifier
                    .size(450.dp)
                    .clickable { navigateToLogin() }
            )
            Spacer(modifier = Modifier.height(24.dp))
            Image(
                painter = painterResource(id = R.drawable.next),
                contentDescription = "Login Button",
                modifier = Modifier
                    .size(200.dp)
                    .clickable { navigateToLogin() }
                    .padding(16.dp),
                alignment = Alignment.BottomCenter
            )
        }
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(navigateToLogin = {})
}
