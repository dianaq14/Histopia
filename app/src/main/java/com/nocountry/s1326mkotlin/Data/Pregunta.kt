package com.nocountry.s1326mkotlin.Data

data class Pregunta(
    val texto: String,
    val respuestas: List<String>,
    val respuestaCorrecta: String,
    val codigo: String
)
