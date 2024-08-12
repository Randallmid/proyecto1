package conceptos_POO

class Persona {
    var nombre: String = ""
    var edad: Int = 0
    fun inicializar(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad

    }

    fun imprimiendo(){


        println("nombre: $nombre y tiene una edad de $edad")
    }

    fun EsmayorEdad() {
        if (edad >= 18)
            println("es mayor de edad ")
        else
            println("no es mayor de edad")
    }
}

fun main (){
    val persona1: Persona
    persona1=Persona()
    persona1.inicializar("pedro",16)
    persona1.imprimiendo()
    persona1.EsmayorEdad()

    val persona2:Persona
    persona2=Persona()
    persona2.inicializar("ana", 50)
    persona2.imprimiendo()
    persona2.EsmayorEdad()

}
