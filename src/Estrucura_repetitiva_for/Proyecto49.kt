package Estrucura_repetitiva_for

fun main() {
    var aprobados = 0
    var reprobados = 0
    for (index in 1..10) {
        println("Ingrese nota $index: ")
        val nota = readln().toInt()
        if (nota >= 7) {
            aprobados++
        } else {
            reprobados++
        }
    }
    println("Cantidad de alomnos con notas mayores o" + "iguales a 7: $aprobados")
    println("Cantidad de alumnos con notas menores a " + "7: $reprobados")

}