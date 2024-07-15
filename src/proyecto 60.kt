fun main() {
   print("ingrese primer nota ")
    val nota1= readln().toInt()
   print("ingrese segunda nota ")
    val nota2 = readln().toInt()
   print("ingrese tercer nota ")
    val nota3 = readln().toInt()
    val promedio = (nota1+nota2+nota3)/3
    println("su nota es $promedio")
    when {
        promedio >=7 -> println("promocionado")
        promedio >=4 ->print("regular")
        else -> print("libre ")


    }


















}