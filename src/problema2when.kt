fun main() {
var mayor = 0
    for (i in 1..5 ){
        println("ingrese el primer valor : ")
        val num1 = readln().toInt()
        println ("ingrese el segundo valor:")
        val num2 = readln().toInt()
        println("ingrese el tercer valor:")
        val num3 = readln().toInt()
        mayor += when {
            num1 > num2 && num1 > num3 -> num1
            num2 > num1 && num3 > num2 -> num2
            else -> num3

        }

    }
println("el valor acumulado de los numeros mayores es $mayor")







}