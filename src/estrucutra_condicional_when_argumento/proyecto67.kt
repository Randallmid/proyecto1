package estrucutra_condicional_when_argumento

fun main() {
    print("ingrese un valor entero positivo comprendido entre 1 y 99999")
    val valor = readln().toInt()
    when (valor){
        in 1..9 -> print("tiene un digito")
        in 10..99 -> print("tiene 2 digitos")
        in 100..999 -> print("tiene 3 digitos")
        in 1000..9999 -> print("tiene 4 digitos")
        in 10000..99999 -> print("tiene 5 digitos")
        in 1234567889..1234567890 -> print("descubriste el easter egg")
        else -> print ("no se encuentra numero comprendido en rango indicado")
    }
}