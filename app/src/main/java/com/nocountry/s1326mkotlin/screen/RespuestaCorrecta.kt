package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import com.nocountry.s1326mkotlin.Screen

@Composable
fun RespuestaCorrecta(navController: NavController) {

    var Siguiente by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
            .background(color = Color(0xFF1E1E1F)),
    ) {
        Text(
            text = "¡Felicitaciones! ",
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
            text = "Respuesta correcta ",
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
                contentDescription = "null",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(500.dp)
            )
        }

        val botonsiguienteBackgroundColor = if (Siguiente== "Siguiente pregunta") Color(0xFFAB94F7) else Color(0xFFFFFDFE)


        TextButton(
            onClick = { navController.navigate("trivia2") },
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(18.dp)
                .background(botonsiguienteBackgroundColor)
                .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(30.dp))
                .clickable(
                    onClick = { navController.navigate("trivia2") },
                )
        )   {
            Text(
                text = "Siguiente Pregunta",
                color = Color.Black,
                fontSize = 26.sp,
                fontFamily = FontFamily(Font(R.font.poppins_bold)),
            )
        }

    }
}

@Preview
@Composable
fun RespuestaCorrectaPreview() {

    val navController = rememberNavController()

    RespuestaCorrecta(navController = navController)

}
