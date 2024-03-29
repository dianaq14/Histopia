package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.R
import com.nocountry.s1326mkotlin.Screen

@Composable
fun HomeScreen(navController: NavController) {
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
                    .clickable { }
            )
            Image(
                painter = painterResource(id = R.drawable.bienvenida_2),
                contentDescription = null,
                modifier = Modifier
                    .size(450.dp)
                    .clickable { }
            )
            Spacer(modifier = Modifier.height(24.dp))

            BottomNavigation(
                modifier = Modifier.fillMaxWidth(),
                backgroundColor = Color(0xFFAA94F6)
            ) {
                Surface(
                    color = Color(0xFEFFFE),
                    modifier = Modifier.fillMaxWidth()
                ) {

                    val colorbtn= Color(0xFEFFFE)
                    BottomNavigationItem(
                        selected = false,
                        onClick = { navController.navigate("onboardingscreen") },
                        icon = {
                            Button(
                                onClick = { navController.navigate("onboardingscreen") },
                                colors = ButtonDefaults.buttonColors(
                                    contentColor = Color.Black,
                                    containerColor = Color(0xFFB5FFFDFE),
                                ),
                                modifier = Modifier
                                    .padding(8.dp)
                                    .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(30.dp))
                            ) {
                                Text(
                                    text = "Ingresar", color = Color.Black,
                                    fontSize = 14.sp,
                                    modifier = Modifier.padding(4.dp)
                                )
                            }
                        }
                    )

                }
            }
        }
    }
}
@Preview
@Composable
fun HomeScreen(){
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}

