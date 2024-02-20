package com.nocountry.s1326mkotlin

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
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
        composable(Screen.Temas.route) {
            // TemasScreen
        }
    }
}

