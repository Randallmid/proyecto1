
fun main() {
/*
    var X =1
    while (X<=100){
        println(X)
        X++
    }
*/
    /*
    print("ingrese un valor")
    val valor: Int = readln().toInt()
    var X = 1
    while (X<= valor){ println(X)
        X++
        }
     */
    /*
    var x = 1
    var suma = 0
    while (x<=10 ){
        println("ingrese el valor $x")
        val valor = readln().toInt()
        suma=suma +valor
        x++
    }
    println("la suma de los 10 valores ingresados es de $suma ")
    val promedio= suma/10
  println("el promedio es de $promedio")

     */
println("cuantas piezas procesarà?")
val n = readln().toInt()
    var x =1
    var cantidad =0
    while (x<= n ){
        println("ingrese la medida de la pieza")
        val largo= readln().toDouble()
        if (largo>=1.20 && largo <=1.30){
            cantidad=cantidad+1
            x=x+1;
        }
        println("la cantidad de piezas aptas son $cantidad")}





}
