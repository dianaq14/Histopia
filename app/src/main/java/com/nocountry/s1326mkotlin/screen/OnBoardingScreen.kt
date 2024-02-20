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

val myColor = Color(red = 170f / 255f, green = 148f / 255f, blue = 246f / 255f)
val color1 = Color(0xFF1E1E1F)

@Composable
fun OnboardingScreen(navController: NavController) {
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
                painter = painterResource(id = R.drawable.ob1),
                contentDescription = "null",
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFF1E1E1F))
            )
        }

        Column(
            modifier = Modifier
                .padding(vertical = 24.dp)
                .background(myColor),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Bienvenido a Histopia",
                fontSize = 24.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .padding(bottom = 8.dp),
                textAlign = TextAlign.Center
            )
            Text(
                text = "Descubre una forma emocionante de aprender historia mientras juegas y compites con otros usuarios.",
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
                    onClick = { navController.navigate("temas_screen") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                        .background(color = Color.Transparent)
                ) {
                    Text(text = "Saltar", color = Color.Black, fontSize = 25.sp)
                }

                TextButton(
                    onClick = { navController.navigate("onboarding2_screen") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow),
                        contentDescription = "Next",
                        modifier = Modifier.size(50.dp)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun OnboardingScreenPreview() {
    val navController = rememberNavController()
    OnboardingScreen(navController = navController)
}
