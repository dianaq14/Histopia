package com.nocountry.s1326mkotlin

sealed class Screen(val route: String) {
    object Home : Screen("home_screen")
    object OnboardingScreen : Screen("onboardingscreen")
    object Onboarding2_Screen : Screen("onboarding2_screen")
    object Onboarding3 : Screen("onboarding3")
    object Temas: Screen("temas")
    object EdadMedia: Screen("EdadMedia")
    object TriviaEdadMedia : Screen("trivia")
    object RespuestaCorrecta : Screen("correcto")
    object RespuestaCorrecta2 : Screen("correcto2")
    object RespuestaC3 : Screen("correcto3")
    object RespuestaC4 : Screen("correcto4")
    object RespuestaIncorrecta: Screen("incorrecto")
    object Trivia2 : Screen("trivia2")
    object Trivia3 : Screen("trivia3")
    object Trivia4 : Screen("trivia4")
    object Trivia5 : Screen("trivia5")
    object Trivia6 : Screen("trivia6")
    object NivelCompleto: Screen("completo")
    object Logros: Screen("logros")
    object Perfil: Screen("perfil")

}
