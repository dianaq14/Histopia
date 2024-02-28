package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
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
            .background(color= Color(0xFF1E1E1F))
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Selecciona un Tema",
            fontSize = 20.sp,
            fontFamily = FontFamily(Font(R.font.poppins_regular)),
            color = Color.White,
            modifier = Modifier.padding(vertical = 16.dp)
        )
        TemaCard(
            tema = "Edad Media",
            image = R.drawable.edadmedia,
            onClick = { navController.navigate("EdadMedia") }
        )
        TemaCard(
            tema = "Edad Moderna",
            image = R.drawable.edadmoderna,
            onClick = { navController.navigate("EdadModerna") }
        )
        TemaCard(
            tema = "Guerras",
            image = R.drawable.guerras,
            onClick = { navController.navigate("Guerras") }
        )
        TemaCard(
            tema = "Revoluciones",
            image = R.drawable.revoluciones,
            onClick = { navController.navigate("Revoluciones") }
        )
        Spacer(modifier = Modifier.weight(1f))
        BottomNavigation(
            modifier = Modifier.fillMaxWidth(),
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
                label = { Text("Home") }
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
                label = { Text("Temas") }
            )
            BottomNavigationItem(
                icon = {
                    Image(
                        painter = painterResource(id = R.drawable.logros),
                        contentDescription = null,
                        modifier = Modifier.size(24.dp)
                    )
                },
                selected = false,
                onClick = { navController.navigate("logros") },
                label = { Text("Logros") }
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
                label = { Text("Usuario") }
            )
        }
    }
}

@Composable
fun TemaCard(tema: String, image: Int, onClick: () -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF3a7ff))
            .clickable(onClick = onClick)
            .padding(vertical = 8.dp)

    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .size(80.dp)
            )
            Text(
                text = tema,
                fontSize = 14.sp,
                color = Color.Black,
                fontFamily = FontFamily(Font(R.font.poppins_regular)),
                modifier = Modifier.padding(vertical = 8.dp),
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
