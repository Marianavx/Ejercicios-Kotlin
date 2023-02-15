//for

fun main() {
    var negativos = 0
    var positivos = 0
    var dosDigitos = 0
    print("Cuantos numeros desea ingresar?")
    var n=readLine()!!.toInt()
    for (i in 1..n) {
       print("ingrese un numero")
       val num = readLine()!!.toInt()
        when{
            num >= 0 ->positivos++
            else -> negativos++
        }
        if(num.toString().length >= 2){
            dosDigitos++
        }
    }
    println("cantidad de numeros positivos: $positivos")
    println("cantidad de numeros negativos: $negativos")
    println("cantidad de numeros con dos o mas digitos: $dosDigitos")

} 