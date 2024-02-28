package com.nocountry.s1326mkotlin.screen

import androidx.compose.material.Card
import androidx.compose.material.TopAppBar
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material.TextButton
import androidx.compose.material3.CardDefaults
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import androidx.wear.compose.material3.ButtonDefaults
import androidx.wear.compose.material3.TextButtonDefaults
import com.nocountry.s1326mkotlin.R


@Composable
fun TriviaEdadMedia(navController: NavController) {

    val colorf = Color(0xFF1E1E1F)
    var respuestaSeleccionada by remember { mutableStateOf("") }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
            .background(color = Color(0xFF1E1E1F)),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Preguntas",
            fontSize = 20.sp,
            color = Color.White,
            fontFamily = FontFamily(Font(R.font.poppins_regular)),
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(50.dp)
                .background(color = Color(0xFF1E1E1F))
        ) {
            Image(
                painter = painterResource(id = R.drawable.barra),
                contentDescription = "null",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(324.dp)
            )
        }

        //CardView con la trivia

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            backgroundColor = Color(0xFFC6B7FA),
            shape = RoundedCornerShape(12.dp)
        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
            ) {
                TopAppBar(
                    title = { Text("60seg") },
                    navigationIcon = {
                        Image(
                            painter = painterResource(id = R.drawable.reloj),
                            contentDescription = "Usuario de perfil",
                            modifier = Modifier
                                .size(24.dp)
                                .align(alignment = Alignment.CenterHorizontally)
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
                    backgroundColor = Color(0xFF8F71F0),
                    elevation = 0.dp
                )
                // Pregunta
                Text(
                    text = "¿Qué sistema social predominante existía durante la Edad Media, donde los campesinos trabajaban la tierra a cambio de protección y una porción de las cosechas?",
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    color = Color.Black,
                    modifier = Modifier.padding(bottom = 16.dp)
                )

                // Respuestas
                val respuestas = listOf(
                    "Feudalismo",
                    "Capitalismo",
                    "Socialismo",
                    "Comunismo"
                )
                respuestas.forEach { respuesta ->
                    RespuestaItem(
                        text = respuesta,
                        onClick = { respuestaSeleccionada = respuesta },
                        seleccionada = respuestaSeleccionada == respuesta
                    )
                }

                // Botón Enviar respuesta
                val botonEnviarBackgroundColor = if (respuestaSeleccionada == "Feudalismo") Color(0xFFB1FCDC) else Color(0xFFFFFDFE)

                TextButton(
                    onClick = {
                        if (respuestaSeleccionada == "Feudalismo") {
                            navController.navigate("correcto")
                        } else {
                            respuestaSeleccionada == "Capitalismo" || respuestaSeleccionada == "Socialismo" || respuestaSeleccionada == "Comunismo"
                            navController.navigate("incorrecto")
                        }
                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .background(botonEnviarBackgroundColor),
                    shape = RoundedCornerShape(12.dp)
                ) {
                    Text(
                        text = "Enviar respuesta",
                        modifier = Modifier.padding(8.dp)
                    )
                }
            }
        }



        // BottomAppBar
        BottomAppBar(
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
fun RespuestaItem(text: String, onClick: () -> Unit, seleccionada: Boolean) {
    var selected by remember { mutableStateOf(false) }

    val backgroundColor = if (selected) Color(0xFFCF72C4) else Color(0xFFE79CDD)

    TextButton(
        onClick = {
            onClick()
            selected = !selected
        },
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 4.dp)
            .background(backgroundColor, RoundedCornerShape(4.dp))
    ) {
        Text(
            text = text,
            color = Color.Black,
            fontSize = 14.sp,
            fontFamily = FontFamily(Font(R.font.poppins_regular)),
        )
    }
}


@Preview
@Composable
fun TriviaEdadMediaPreview() {
    val navController = rememberNavController()

    TriviaEdadMedia(navController = navController)
}
