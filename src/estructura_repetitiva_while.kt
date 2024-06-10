
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
    /*
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

     */
    //problemas propuestos
    //numero 1
/*
    var x = 1
    var notaspepe = 0
    var notassech = 0
    while (x <= 10) {
        print("Ingrese la nota del estudiante:")
        val nota: Int = readln().toInt()
        x = x + 1
        if(nota >= 7 && nota < 10)
            notaspepe = notaspepe + 1
        else
            notassech = notassech + 1 }
    println("Los estudiantes que aprobaron son $notaspepe")
    println("los estudiantes que reprobaron son  $notassech")
    */



 //segunod problema propuesto

   /* var x = 1
    print("Ingrese el numero de alturas que desea ingresar:")
    val n: Int = readln().toInt()
    var sumation = 0.0
    while (x <= n) {
        print("Ingrese la altura:")
        val altura: Double = readln().toDouble()
           sumation = sumation + altura
            x = x + 1
    }
    val promedio = sumation/n

    println("La altura promedio de las personas es: $promedio")

    */
    //numero 3
/* var x = 1
    print("Ingrese la cantidad de empleados:")
    val n: Int = readln().toInt()
    var suma = 0
    var sueldomin = 0
    var sueldomax = 0
    while (x <= n) {
        print("Ingrese el sueldo del empleado:")
        val sueldo: Int = readln().toInt()
        suma = suma + sueldo
        x = x + 1
        if(sueldo >= 100 && sueldo <= 300)
            sueldomin = sueldomin + 1
        else
            if(sueldo >= 300 && sueldo <= 500)
                sueldomax = sueldomax + 1
    }
    val importe = suma*n
    println("El numero de empleados que cobran entre $100 y $300 son: $sueldomin")
    println("El numero de empleados que cobran más de $300 son: $sueldomax")
    println("El importe que gasta la empresa es de $importe
    /*
    var x = 11
    while (x <= 275) {
        println("$x")
        x = x + 11
    }


 */
 */
    //numero 4

//numero 5
    /*
     var pepe = 0
    var valorseichon = 11
    while (pepe<25){
        println("$valorseichon"); valorseichon =valorseichon+11; pepe=pepe+1
    }
 /*
    var x = 1
    var x2 = 1
    var suma1 = 0
    var suma2 = 0
    println("Lista 1")
    while (x <= 5) {
        print("Ingrese un valor:")
        val vall1: Int = readln().toInt()
        suma1 = suma1 + vall1
        x = x + 1
    }
    println("Lista 2")
    while (x2 <= 5) {
        print("Ingrese un valor:")
        val vall2: Int = readln().toInt()
        suma2 = suma2 + vall2
        x2 = x2 + 1
    }
    if(suma1 == suma2)
        println("Listas iguales")
    else
        if(suma1 > suma2)
            println("Lista 1 mayor")
    else
        if(suma2 > suma1)
            println("Lista 2 mayor")
    */

    */
    /*
   var x = 1
   var pares = 0
   var impares = 0
   print("Ingrese la cantidad de numeros deseada a ingresar:")
   val n : Int = readln().toInt()
   while (x <= n) {
       print("Ingrese un numero:")
       val num: Int = readln().toInt()
       x = x + 1
       if (num % 2 == 0)
           pares = pares + 1
       else
           impares = impares + 1
   }
   println("La cantidad de numero pares es: $pares")
   println("La cantidad de numero impares es: $impares")
   */







}
