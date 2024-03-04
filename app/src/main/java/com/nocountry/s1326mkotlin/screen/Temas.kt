package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.SnackbarDefaults
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.R

@Composable
fun Temas(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF1E1E1F)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selecciona un Tema",
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            color = Color.White,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        Spacer(modifier = Modifier.height(20.dp))

        TemaCard(
            tema = "Edad Media",
            image = R.drawable.edadmedia,
            onClick = { navController.navigate("EdadMedia") }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TemaCard(
            tema = "Edad Moderna",
            image = R.drawable.edadmoderna,
            onClick = { navController.navigate("EdadModerna") }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TemaCard(
            tema = "Guerras",
            image = R.drawable.guerras,
            onClick = { navController.navigate("Guerras") }
        )
        Spacer(modifier = Modifier.height(20.dp))

        TemaCard(
            tema = "Revoluciones",
            image = R.drawable.revoluciones,
            onClick = { navController.navigate("Revoluciones") }
        )
        Spacer(modifier = Modifier.weight(1f))

        BottomNavigation(
            modifier = Modifier
                .fillMaxWidth(),
            backgroundColor = Color(0xFFAA94F6)
        ) {
            BottomNavigationItem(
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.home),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                selected = false,
                onClick = { navController.navigate("home_screen") },
                label = {
                    Text(
                        "Home", fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )
                }
            )
            BottomNavigationItem(
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.temas),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                selected = false,
                onClick = { navController.navigate("temas") },
                label = {
                    Text(
                        "Temas", fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )
                }
            )
            BottomNavigationItem(
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.ranking),
                        contentDescription = null,
                        modifier = Modifier.size(34.dp)
                    )
                },
                selected = false,
                onClick = { navController.navigate("logros") },
                label = {
                    Text(
                        "Logros", fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )
                }
            )
            BottomNavigationItem(
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.perfil),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                selected = false,
                onClick = { navController.navigate("perfil") },
                label = {
                    Text(
                        "Perfil", fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )
                }
            )
        }
    }
}

@Composable
fun TemaCard(tema: String, image: Int, onClick: () -> Unit) {

    val fondocard = Color(0xFFE79CDD)

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(12.dp),
        shape = RoundedCornerShape(12.dp),

        ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp)
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(16.dp)
            )
            Text(
                text = tema,
                fontSize = 16.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
                modifier = Modifier.padding(vertical = 12.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}


@Preview
@Composable
fun TemasPreview() {
    val navController = rememberNavController()
    Temas(navController = navController)
}
