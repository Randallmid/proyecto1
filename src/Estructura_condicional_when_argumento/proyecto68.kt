package Estructura_condicional_when_argumento
fun main() {
    var cant1= 0
    var cant2 = 0
    for(i in 1..10) {
        print("Ingrese un valor entero: ")
        val valor = readln().toInt()
        when (valor) {
            0 -> cant1 ++
                    1,5,10 -> cant2 ++
        }
    }
      println("Cantidad de números 0 ingresados: $cant1")
      println("Cantidad de números 1, 2 0 3 ingresados: $cant2")


}