/*<<<<<<< HEAD
package Estructura_condicional_when
fun main(parametro: Array<String>) {
 var cant1 = 0
 var cant2 = 0
 var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        when {
            peso > 10.1 -> cant1++
            peso >= 9.8 && peso <= 10.2 -> cant2++
            peso < 9.8 && peso > 0 -> cant3++
        }
    } while(peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas con n peso superior a 10.2: $cant2")
    println("Piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("Canidad total de piezas procesadas: $suma")

}
=======
package Estructura_condicional_when
fun main(parametro: Array<String>) {
 var cant1 = 0
 var cant2 = 0
 var cant3 = 0
    do {
        print("Ingrese el peso de la pieza (0 para finalizar): ")
        val peso = readln().toDouble()
        when {
            peso > 10.1 -> cant1++
            peso >= 9.8 && peso <= 10.2 -> cant2++
            peso < 9.8 && peso > 0 -> cant3++
        }
    } while(peso != 0.0)
    println("Piezas aptas: $cant2")
    println("Piezas con n peso superior a 10.2: $cant2")
    println("Piezas con un peso inferior a 9.8: $cant3")
    val suma = cant1 + cant2 + cant3
    println("Canidad total de piezas procesadas: $suma")

}
>>>>>>> 34e7b5e905c0cc972347862b3d036faff310d7a8


 */