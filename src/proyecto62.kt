fun main() {
    var total = 0
    for (i in 1..10){
        println("ingrese el sueldo ")
    val sueldo = readln().toInt()
    total += when {
        sueldo > 5000 -> {
            print("sueldo alto ")
            sueldo
        }

        sueldo > 2000 -> {
            print("sueldo medio")
            0
        }

        else -> {

            println("sueldo bajo ")
            0
        }

    }  }
    print("gastos totales en sueldos $total" )
}