package constructores

class persona constructor(Nombre:String, edad: Int) {
    var Nombre: String = Nombre
    var edad: Int = edad
    init {
        if (edad<0)
            this.edad=0
    }

    fun imprimiendo() {
        println("Nombre: $Nombre y tiene una edad de $edad")

    }

    fun esmayor() {
        if (edad >= 18)
            println("Es mayor de edad")
        else
            println("es menor de edad")

    }
}

fun main() {
    val persona1 = persona ("Juan", 12)
    persona1.imprimiendo()
    persona1.esmayor()

}

