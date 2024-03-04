package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Card
import androidx.compose.material.Text
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
fun Logros(navController: NavController) {

    val fondocard = Color(0xFFAB95F6)

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFF1E1E1F))
            .padding(10.dp)
    ) {
        // Card de Posiciones
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            backgroundColor = (fondocard),
            shape = RoundedCornerShape(12.dp)

        ) {
            Column(
                modifier = Modifier.padding(16.dp)
                    .background(color = Color(0xFFAB95F6))
                    .padding(12.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Posiciones",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    repeat(1) {
                        Image(
                            painter = painterResource(id = R.drawable.copas),
                            contentDescription = null,
                            modifier = Modifier.size(150.dp)
                        )
                    }
                }

                Text(
                    text = "Nivel actual: Aprendiz",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(12.dp))
        // Card de Ranking
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            backgroundColor = Color(0xFF1E1E1F)
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Ranking",
                    color = Color((0xFFAB95F6)),
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(bottom = 12.dp)
                        .align(Alignment.CenterHorizontally)
                )

                LazyColumn {
                    items(rankings) { ranking ->
                        RankingItem(ranking = ranking)
                    }
                }
            }
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
                        androidx.compose.material3.Text(
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
                        androidx.compose.material3.Text(
                            "Temas", fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_medium))
                        )
                    }
                )
                BottomNavigationItem(
                    icon = {
                        Image(
                            painter = painterResource(id = R.drawable.logros),
                            contentDescription = null,
                            modifier = Modifier.size(34.dp)
                        )
                    },
                    selected = false,
                    onClick = { navController.navigate("logros") },
                    label = {
                        androidx.compose.material3.Text(
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
                        androidx.compose.material3.Text(
                            "Perfil", fontSize = 12.sp,
                            fontFamily = FontFamily(Font(R.font.poppins_medium))
                        )
                    }
                )
            }
        }
    }
}


@Composable
fun RankingItem(ranking: Ranking) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = ranking.icono),
            contentDescription = null,
            modifier = Modifier.size(48.dp)
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column {
            Text(
                text = ranking.nombre, fontSize = 18.sp, color = Color.White,
            )
            Text(text = "Puntos: ${ranking.puntos}", fontSize = 16.sp, color = Color.White)
        }
    }
}

data class Ranking(
    val posicion: Int,
    val nombre: String,
    val puntos: Int,
    val icono: Int
)

val rankings = listOf(
    Ranking(1, "Alan", 110, R.drawable.avatar_alan),
    Ranking(2, "Mar", 95, R.drawable.avatar_mar),
    Ranking(3, "Mario", 87, R.drawable.avatarmario),
    Ranking(3, "Sol", 83, R.drawable.avatar_sol),
    Ranking(3, "Pedro", 80, R.drawable.avatarpedro)
)

@Composable
@Preview
fun LogrosPreview() {
    val navController = rememberNavController()
    Logros(navController = navController)
}
