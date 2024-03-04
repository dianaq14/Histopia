package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

val fondo2 = Color(0xFFE69CDC)

@Composable
fun Onboarding2_Screen(navController: NavController) {
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
                painter = painterResource(id = R.drawable.img2),
                contentDescription = "null",
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color(0xFF1E1E1F))
            )
        }

        Column(
            modifier = Modifier
                .background(fondo2)
                .padding(0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Elije tu aventura",
                color = Color.Black,
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
                modifier = Modifier
                    .padding(horizontal = 16.dp, vertical = 8.dp)
                    .padding(bottom = 8.dp),
            )
            Text(
                text = "Selecciona un fascinante tema histórico que te intrigue y da inicio a tu emocionante aventura.",
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
                    Text(
                        text = "Saltar",
                        color = Color.Black,
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium)),
                    )
                }

                TextButton(
                    onClick = { navController.navigate("onboarding3") },
                    modifier = Modifier
                        .weight(1f)
                        .padding(16.dp)
                        .background(color = Color.Transparent)
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_arrow2),
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
fun Onboarding2_Screen() {
    val navController = rememberNavController()

    Onboarding2_Screen(navController = navController)

}
