package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.ButtonColors
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.R

@Composable
fun EdadMediaScreen(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        // CardView para el TopAppBar y el TextButton
        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = 8.dp,
            backgroundColor = Color(0xFF1E1E1F)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                TopAppBar(
                    title = {
                        Text(
                            "Hola, Mario!",
                            fontSize = 14.sp,
                            color = Color.White,
                            fontFamily = FontFamily(Font(R.font.poppins_medium)),
                        )
                    },
                    navigationIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.user),
                            contentDescription = "Usuario de perfil",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    actions = {
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Image(
                                painter = painterResource(id = R.drawable.moneda),
                                contentDescription = "Recompensas",
                                modifier = Modifier.size(24.dp)
                            )
                            Spacer(modifier = Modifier.width(16.dp))
                            Image(
                                painter = painterResource(id = R.drawable.corazon),
                                contentDescription = "Vidas",
                                modifier = Modifier.size(24.dp)
                            )
                        }
                    },
                    backgroundColor = Color.Transparent,
                    elevation = 0.dp
                )
                Spacer(modifier = Modifier.height(16.dp))

                TextButton(
                    onClick = { navController.navigate("temas") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(22.dp)
                        .padding(horizontal = 20.dp, vertical = 10.dp)
                        .background(
                            color = Color(0xFFE69CDC),
                            shape = RoundedCornerShape(12.dp) // Redondear los bordes
                        )
                ) {
                    Text(text = "Tema: Edad Media", color = Color.Black)
                }
            }
        }

        // CardView para la imagen de fondo
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .background(color = Color(0xFF1E1E1F)),
            elevation = 8.dp
        ) {
            Image(
                painter = painterResource(id = R.drawable.fondo_edadmedia),
                contentDescription = "Imagen de la Edad Media",
                modifier = Modifier
                    .fillMaxSize()
                    .size(450.dp)
                    .background(color = Color(0xFF1E1E1F))
                    .clickable {navController.navigate("Trivia") }
            )
        }

        // BottomNavigation fuera de las CardView
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
                label = { androidx.compose.material3.Text("Home") }
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
                label = { androidx.compose.material3.Text("Temas") }
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
                label = { androidx.compose.material3.Text("Logros") }
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
                label = { androidx.compose.material3.Text("Usuario") }
            )
        }
    }
}

@Preview
@Composable
fun EdadMediaScreenPreview() {
    val navController = rememberNavController()

    EdadMediaScreen(navController = navController)
}
