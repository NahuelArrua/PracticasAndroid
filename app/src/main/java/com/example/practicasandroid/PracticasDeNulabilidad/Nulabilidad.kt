package com.example.practicasandroid.PracticasDeNulabilidad

import com.example.practicasandroid.favoriteActor

class Nulabilidad {
}


//Declaracion de Variables.
/*Cuando declaramos una variable debemos asignarles un valos por ejemplo*/

val favoriteSinger = "Alejandro Saenz"

/*fun main() {
    val favoriteSinger = "Alejandro Saenz"
    println(favoriteActor)
}*/

/*Que pasaria si no tuviera un cantante favorito y desidira asignarle a mi variable
* un valor "no body" o "none" (nadie, ninguno), pues esto no esta bien por que de esta
* manera mi programa interpreta que mi variable tiene un valor "no body" o "none" en
* lugar de mostrar ningun valor... En Kotlin puedes usar Null para indicar que no hay
* un valor asociado a una variable*/

//val favoriteSinger = null

fun main() {
    val favoriteSinger = null
    println(favoriteActor)
}

