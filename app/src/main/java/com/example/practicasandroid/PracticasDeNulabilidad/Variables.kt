package com.example.practicasandroid.PracticasDeNulabilidad

class Variables {
}

//Declaracion de Variables.

/*Kotlin utiliza dos palabras claves diferentes para declarar variables (var y val)*/

/* -Usa val para declarar una variable cuyo valor no cambia.No puedes volver a asignarle
    un valor a una variable que se declaro mediante val

   -Utiliza var para una variable cuyo valor puede cambiar*/

//En este ejemplo Number es un tipo de variable Int que asigna un valor de 10.

//var Number: Int = 10

/*Int es un tipo que representa un numero entero, uno de los tantos tipos numericos que
se pueden representar: Byte, Short, Long, Float y Double segun tus datos numericos.*/

/*La palabra clave var quiere decir que puedes volver a asignarle valores a Number segun
sea necesario. Por ejemplo puedes cambiar Number de 10 a 15*/

/*Observa el siguiente ejemplo. Como puedes Observar se inicializa la funcion main y como se
puede observar si hacemos un debug de esta funcion main es que toma el nr 10 e intenta
imprimirlo pero el nr no tiene un objeto complementario ya cambiamos number 10 por number
15, en este caso si seguimos la linea de codigo en la tercera linea se imprimira el mismo nr
osea el 10 pero ya en la cuarta liena(en el prinln ya estaria tomando por objeto
complementario al numero 15 y lo imprimira sin problemas. Esta es la ventaja de var que
podemos cambiarla sin inconvenientas mirntras que si era una  variable de tipo val no lo
podriamos hacer.) */


/*fun main(){
    var Number: Int = 10
    Number = 15
    println(Number)
}*/

/*Este es el mismo ejemplo pero en vez de crear la funcion con una variable de tipo var
creamos una funcoin de tipo val y vemos que nos da un error, ya que como dijimos las
funciones de tipo val no pueden ser modificadas. Si nos paramos donde nos marca el error
nos daremos cuenta que nos indica "change to var" (cambiar a var) y si clickeamos en
esa opcion podriamos v¿cambiar el nr de 10 a 15 sin ni un problema.*/

/*fun main(){
    val Number: Int = 10
    Number = 15
    println(Number)
}*/













