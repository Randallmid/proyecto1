package funciones_parametros_valor_por_defecto

fun titulosub (titulo:String, caracter: String=  "*"){
    println(titulo)
    for (i in 1..titulo.length)
    print(caracter)
    println()

}
fun main() {
    titulosub("sistema de administracion",)
    titulosub("ventas", "-")
}


