package Concepto_funciones
fun presentacion(){
    println("Programa que permite cargar dos valores por teclado")
    println("Efectua la suma de los valres")
    println("Muestra el resultado dela suma")
    println("******************************")
}
fun cargarSumar(){
    print("Ingrese el primer valor: ")
    val valor1 = readln().toInt()
    print("Ingrese el segundo valor")
    val valor2 = readln().toInt()
    val suma = valor1 + valor2
    println("La suma de los dos valores es: $suma")
}

fun finalizacion(){
    println("******************************")
    println("Gracias por utilizar este programa")
}

fun main() {
    presentacion()
    cargarSumar()
    finalizacion()
}