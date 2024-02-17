package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.nocountry.s1326mkotlin.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LoginScreen() {
    val backgroundColor = Color(0xFF000000)
    val textColor = Color(0xFFFFFFFF)
    val accentColor = Color(0xFF604D81)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Inicia sesión",
                style = TextStyle(
                    color = textColor,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                ),
                modifier = Modifier.padding(top = 16.dp)
            )

            // Email
            OutlinedTextField(
                value = "email",
                onValueChange = {},
                label = { Text("Correo electrónico", color = textColor) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 14.dp)
            )

            // Contraseña
            OutlinedTextField(
                value = "contraseña",
                onValueChange = {},
                label = { Text("Contraseña", color = textColor) },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 14.dp)
            )

            //inicio de sesión
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 16.dp)
                    .background(accentColor, CircleShape),
            ) {
                Text(
                    text = "Ingresar",
                    color = textColor
                )
            }

            Text(
                text = "¿No tienes cuenta?",
                style = TextStyle(color = textColor),
                modifier = Modifier
                    .padding(top = 16.dp)
            )

            Divider(
                color = textColor,
                modifier = Modifier.padding(vertical = 8.dp)
            )

            // registro con Google
            TextButton(
                onClick = {},
                modifier = Modifier.padding(bottom = 16.dp)
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = "Google",
                        modifier = Modifier
                            .size(24.dp)
                    )
                    Spacer(
                        modifier = Modifier
                            .width(28.dp)
                    )
                    Text(
                        text = "Continuar  con Google",
                        color = textColor
                    )
                }
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.img_login),
                    contentDescription = "imagen",
                    modifier = Modifier
                        .size(350.dp)
                )
            }

        }

    }
}


@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}
