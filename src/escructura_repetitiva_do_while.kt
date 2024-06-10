fun main() {
    /*do {
        println("ingrese un valor comprendido entre 0 y 999 ")
        val valor= readln().toInt()
        if (valor<10 )
            println("el numero tiene un digito")
        else
            if (valor<100)
                print("el numero tiene 2 digitos" )
        else println("el numero tiene 3 digitos")




    }while (valor!= 0 )


     */
/*
//segundo problema
var cant = 0
var suma = 0
do {
    print("ingrese un valor(0 para finalizar )")
    val valor= readln().toInt()
    if (valor!=0 ){
        suma+=valor
        cant++
    }

} while (valor!=0)
if (cant!=0){val promedio= suma/cant
println("el promedio de los valores ingresados es de $promedio")

}else{print("no se ingresaron valores correctos")}

 */
//problema 3
    var cantidad_inferior =0 //por debajo de 9.8
    var cantidad_superior=0
    var cantidad_adecuada=0

    do {
        println("ingrese el peso de la pieza (o 0 para finalizar)")
        val peso = readln().toInt()
        if (peso>10.2)
            cantidad_superior++
        else
            if (peso >= 9.8)
                cantidad_adecuada++
        else
            cantidad_inferior++



    }while (peso!=0.0)
    println("piezas aptas: $cantidad_adecuada")
    println("piezas de peso superior: $cantidad_superior")
    println("piezas de peso inferior: $cantidad_inferior")
    val suma = cantidad_adecuada + cantidad_inferior + cantidad_superior
    println("cantidad total de piezas procesadas: $suma")









}
