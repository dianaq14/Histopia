package com.nocountry.s1326mkotlin

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object OnboardingScreen : Screen("onboardingscreen")
    object Onboarding2_Screen : Screen("onboarding2_screen")
    object Onboarding3 : Screen("onboarding3")
    object Temas: Screen("temas")
    object EdadMedia: Screen("EdadMedia")
    object TriviaEdadMedia : Screen("Trivia")
    object RespuestaCorrecta : Screen("correcto")
    object RespuestaIncorrecta: Screen("incorrecto")


}
