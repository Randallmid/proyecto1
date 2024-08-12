package conceptos_POO

class Alumno () {
    var nombre= String
    var nota = Int

    fun inicializar() {
        println("ingrese su nombre uwu")
        nombre = readln()
        println("ingrese su nota")
        nota = Int

    }

    fun notamayor() {
        if (4 <= nota)
            println("la nota es mayor a 4")
        else
            println("la nota es menor a 4")
    }
    fun main () {
        val hola=Alumno
        hola.inicializar()
        hola.notamayor()
    }
}

