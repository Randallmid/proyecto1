fun main() {
    var cant1 = 0
    var cant2 = 0
    var cant3 = 0
    do {
        println("ingrese el peso de la pieza (0 para finalizar)")
        val peso = readln().toDouble()
        when {
            peso > 10.2 -> cant1++
            peso >= 9.8 && peso <= 10.2 -> cant2++
            peso < 9.8 -> cant3++
        } }
        while (peso != 0.0)
            println("piezas aptas $cant2")
        println("piezas con un peso superior $cant1")
        println("piezas con un peso inferior $cant3")
        val suma = cant3 + cant2 + cant1
        print("la cantidad de piezas procesadas :$suma")



    }


