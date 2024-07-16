package estrucutra_condicional_when_argumento

fun main() {
        var cant1=0
        var cant2=0
        var cant3=0
        var cant4=0
        for (i in 1..10) {
            print("ingrese el numero de hijos ")
            val valor = readln().toInt()
            when (valor) {
                0 -> cant1++
                1 -> cant2++
                2 -> cant4++
                else -> cant3++
            }
        }
        println("cantidad de familias sin hijos : $cant1" )
        println("cantidad de familias con un solo hijo : $cant2" )
        println("cantidad de familias con 2 hijos : $cant4")
        println("cantidad de familias con 3 o mas hijos : $cant3 ")

}