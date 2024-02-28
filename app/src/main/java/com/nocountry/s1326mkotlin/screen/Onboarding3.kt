package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.R
import com.nocountry.s1326mkotlin.Screen

val color_fondo = Color(red = 170f / 255f, green = 148f / 255f, blue = 246f / 255f)

@Composable
fun Onboarding3(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF1E1E1F))
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(16.dp)
                .background(color = Color(0xFF1E1E1F))

        ) {
            Image(
                painter = painterResource(id = R.drawable.ob3),
                contentDescription = "null",
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFF1E1E1F))
            )
        }

        Column(
            modifier = Modifier
                .padding(vertical = 24.dp)
                .background(color_fondo),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Comienza a Competir",
                fontSize = 24.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "¡Desafía a tus amigos y a otros usuarios! Pon a prueba tus habilidades y compite en desafíos únicos y divertidos.",
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )

            Spacer(modifier = Modifier.height(32.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                TextButton(
                    onClick = { navController.navigate("temas") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                        .background(color = Color.Transparent)
                ) {
                    Text(text = "Saltar", color = Color.Black, fontSize = 20.sp)
                }

                OutlinedButton(
                    onClick = { navController.navigate("temas") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                ) {
                    Text(text = "Comenzar", color = Color.Black, fontSize = 20.sp)
                }
            }
        }
    }
}

@Preview
@Composable
fun OnboardingScreen3preview() {
    val navController = rememberNavController()
    Onboarding3(navController = navController)
}
