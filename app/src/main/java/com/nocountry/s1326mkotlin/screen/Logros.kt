package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(color = Color(0xFFAB95F6))
            .padding(16.dp)
    ) {
        // Card de Posiciones
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 16.dp),
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier.padding(16.dp),
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
                    // Iconos de logros
                    for (i in 1..3) {
                        Image(
                            painter = painterResource(id = R.drawable.ranking),
                            contentDescription = null,
                            modifier = Modifier.size(64.dp)
                        )
                    }
                }

                Text(
                    text = "Nivel actual: Aprendiz",
                    fontFamily = FontFamily(Font(R.font.poppins_regular)),
                    fontSize = 16.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp)) // Agregamos un espacio entre las Cards

        // Card de Ranking
        Card(
            modifier = Modifier
                .fillMaxWidth(),
            backgroundColor = Color.White
        ) {
            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                Text(
                    text = "Ranking",
                    fontFamily = FontFamily(Font(R.font.poppins_bold)),
                    fontSize = 20.sp,
                    modifier = Modifier.padding(bottom = 8.dp)
                )

                LazyColumn {
                    items(rankings) { ranking ->
                        RankingItem(ranking = ranking)
                    }
                }
            }
        }
    }
}


@Composable
fun RankingItem(ranking: Ranking) {
    // Lógica para mostrar un elemento de ranking
}

data class Ranking(
    val posicion: Int,
    val nombre: String,
    val puntos: Int,
    val icono: Int
)

val rankings = listOf(
    Ranking(1, "Usuario 1", 100, R.drawable.boy),
    Ranking(2, "Usuario 2", 90, R.drawable.girl ),
    Ranking(3, "Usuario 3", 80, R.drawable.man)
)

@Composable
@Preview
fun LogrosPreview() {
    val navController = rememberNavController()
    Logros(navController = navController)
}
