fun main() {
    println("ingrese un numero entero")
    val num= readln().toInt()
    when {
       num > 0  -> println("numero positivo ")
        num <0 -> print("numero negativo ")
        else -> println("numero nulo")
    }
}