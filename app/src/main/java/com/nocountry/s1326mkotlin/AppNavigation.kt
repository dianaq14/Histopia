package com.nocountry.s1326mkotlin

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.nocountry.s1326mkotlin.screen.EdadMediaScreen
import com.nocountry.s1326mkotlin.screen.*

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {

        composable(Screen.Home.route) {
            HomeScreen(navController = navController)
        }
        composable(Screen.OnboardingScreen.route) {
            OnboardingScreen(navController = navController)
        }
        composable(Screen.Onboarding2_Screen.route) {
            Onboarding2_Screen(navController = navController)
        }
        composable(Screen.Onboarding3.route) {
            Onboarding3(navController = navController)
        }
        composable(Screen.Temas.route) {
            Temas(navController = navController)
        }
        composable(Screen.EdadMedia.route) {
            EdadMediaScreen(navController = navController)
        }

        composable(Screen.TriviaEdadMedia.route){
            TriviaEdadMedia(navController = navController)
        }

        composable(Screen.RespuestaIncorrecta.route){
            RespuestaIncorrecta(navController = navController )
        }

        composable(Screen.Trivia2.route){
            Trivia2(navController = navController)
        }
        composable(Screen.Trivia3.route){
            Trivia3(navController = navController)
        }
        composable(Screen.Trivia4.route){
            Trivia4(navController = navController)
        }
        composable(Screen.Trivia5.route){
            Trivia5(navController = navController)
        }
        composable(Screen.Trivia6.route){
            Trivia6(navController = navController)
        }

        composable(Screen.NivelCompleto.route){
            NivelCompleto(navController = navController)
        }
        composable(Screen.RespuestaCorrecta.route){
            RespuestaCorrecta(navController= navController)
        }
        composable(Screen.RespuestaCorrecta2.route){
            RespuestaCorrecta2(navController= navController)
        }
        composable(Screen.RespuestaC3.route){
            RespuestaC3(navController = navController)
        }
        composable(Screen.RespuestaC4.route){
            RespuestaC4(navController = navController)
        }
        composable(Screen.Logros.route){
            Logros(navController= navController)
        }
        composable(Screen.Perfil.route){
            Perfil(navController= navController)
        }


    }
}
