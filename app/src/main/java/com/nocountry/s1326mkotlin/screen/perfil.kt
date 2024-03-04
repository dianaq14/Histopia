@file:OptIn(ExperimentalMaterial3Api::class)

package com.nocountry.s1326mkotlin.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.BottomAppBar
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Button
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.R


@Composable
fun Perfil(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF232023))
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(
            text = "Pefil del Usuario",
            fontSize = 18.sp,
            color = Color(0xFF8F71F0),
            fontFamily = FontFamily(Font(R.font.poppins_bold)),
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 8.dp)
                .padding(bottom = 8.dp),
            textAlign = TextAlign.Center
        )




        ProfileImage(painter = painterResource(id = R.drawable.avatarmario))

        // Formulario de perfil
        ProfileForm()

        // Botón de aplicar cambios
        ApplyChangesButton(navController = navController) {
            Modifier.fillMaxWidth().padding(20.dp)
        }
    }
}

@Composable
fun ProfileImage(painter: Painter) {
    Image(
        painter = painter,
        contentDescription = "Profile Image",
        modifier = Modifier
            .size(120.dp)
            .padding(18.dp)
    )
}

@Composable
fun ProfileForm() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        ProfileTextField(label = "Nombre", value = "Mario Perez")
        ProfileTextField(label = "Usuario", value = "Mario")
        ProfileTextField(label = "Correo", value = "mario123@domain.com")
        ProfileTextField(
            label = "Número celular",
            value = "123-456-7890",
            keyboardType = KeyboardType.Phone
        )
        ProfileDropdownMenu(
            label = "País",
            items = listOf("Argentina", "Brasil", "Colombia", "Chile", "México", "Uruguay", "Perú")
        )
        ProfileDropdownMenu(label = "Género", items = listOf("Femenino", "Masculino", "Otro"))
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileTextField(label: String, value: String, keyboardType: KeyboardType = KeyboardType.Text) {
    Surface(
        modifier = Modifier.fillMaxWidth(),
        color = Color.Transparent,
        contentColor = Color.LightGray
    ) {
        TextField(
            value = value,
            onValueChange = { /* Manejar cambios en el valor del texto */ },
            label = { Text(label) },
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = keyboardType),
        )
    }
}

@Composable
fun ProfileDropdownMenu(label: String, items: List<String>) {
    // Lógica para mostrar un menú desplegable con los elementos dados
}

@Composable
fun ApplyChangesButton(navController: NavController, onClick: () -> Unit) {

    Button(
        onClick = { navController.navigate("onboardingscreen") },
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Black,
            containerColor = Color(0xFFFFFEFE),
        ),
        modifier = Modifier
            .padding(8.dp)
            .border(width = 2.dp, color = Color.Transparent, shape = RoundedCornerShape(30.dp))
    ) {
        Text(
            text = "Aplicar Cambios", color = Color.Black,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(8.dp)
        )
    }

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        BottomAppBar(
            modifier = Modifier.align(Alignment.BottomCenter),
            backgroundColor = Color(0xFF8F71F0)
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
                onClick = { },
                label = {
                    Text(
                        "Home",
                        fontSize = 12.sp,
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
                onClick = { },
                label = {
                    Text(
                        "Temas",
                        fontSize = 12.sp,
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
                onClick = { },
                label = {
                    Text(
                        "Logros",
                        fontSize = 12.sp,
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
                onClick = { },
                label = {
                    Text(
                        "Perfil",
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.poppins_medium))
                    )
                }
            )
        }
    }
}

@Preview
@Composable
fun PerfilPreview() {
    val navController = rememberNavController()

    Perfil(navController = navController)
}
