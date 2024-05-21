fun main() {
    //problema 1
    val lado: Int
    val superficie: Int
    val perimetro: Int
    lado = 50
    superficie = lado * lado
    perimetro = lado * 4
    println(
        "$perimetro es el perimetro " +
                "$superficie es la superficie         "
    )


    val peso_p1: Float
    val peso_p2: Float
    val peso_p3: Float

    peso_p3 = 100F
    peso_p2 = 90F
    peso_p1 = 65F
    val promediopeso: Int
    promediopeso = ((peso_p1 + peso_p3 + peso_p2) / 3).toInt()
    print("$promediopeso kg es el promedio de peso ")


}