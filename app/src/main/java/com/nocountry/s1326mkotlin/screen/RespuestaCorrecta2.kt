package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun RespuestaCorrecta2(navController: NavController) {
    var Siguiente by remember { mutableStateOf("") }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFF1E1E1F)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Text(
            text = "¡Felicitaciones!",
            fontSize = 35.sp,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            modifier = Modifier
                .padding(20.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .border(
                    width = 1.dp,
                    color = Color(0xFF303746),
                    shape = RoundedCornerShape(4.dp)
                )
        )
        Text(
            text = "Respuesta correcta",
            fontSize = 28.sp,
            color = Color(0xFFB0FDDC),
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
                .border(width = 1.dp, color = Color(0xFF303746))
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xFF1E1E1F))
        ) {
            Image(
                painter = painterResource(id = R.drawable.respuestacorrecta),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(500.dp)
            )
        }

        val botonsiguientepBackgroundColor = if (Siguiente== "Siguiente pregunta") Color(0xFFAB94F7) else Color(0xFFFFFDFE)

        Button(
            onClick = { navController.navigate("trivia3")
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = botonsiguientepBackgroundColor,
                contentColor = Color.Black
            ),
            modifier = Modifier.padding(18.dp)
        ) {
            Text(
                text = "Siguiente Pregunta",
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.poppins_medium)),
            )
        }






        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            BottomAppBar(
                modifier = Modifier.align(Alignment.BottomCenter),
                backgroundColor = Color(0xFF8F71F0),
                elevation = 0.dp
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
}
@Preview
@Composable
fun RespuestaCorrecta2Preview() {
    val navController = rememberNavController()
    RespuestaCorrecta2(navController = navController)

}
