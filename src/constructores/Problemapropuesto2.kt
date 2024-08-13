package constructores

    class elpepe (var x : Int, var y: Int){
constructor ():this (0, 0 ){
        print("Ingrese el eje x:")
        x = readln().toInt()
        print("Ingrese el eje y:")
        y = readln().toInt() }

    fun cuadrante(){
        if (x>0 && y>0)
            println("el punto se ubica en el primer cuadrante " )
        else if (x<0 && y > 0)
            println("se encuentra en el segundo cuadrante ")
        else if (x<0 && y< 0)
            println("se encuentra en el tercer cuadrante")
        else
            println("se encuentra en el cuarto cuadrante")
    }
    }

fun main() {
    val elpunto = elpepe()
    elpunto.cuadrante()
}

