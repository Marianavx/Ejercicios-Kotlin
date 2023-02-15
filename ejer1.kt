// estructuras secuenciales
fun main(){
        val vh= 2000
        val iva = 0.1
        print("ingrese el nombre del empleado")
        var nombre = readLine()
        print(" ingrese las horas trabajadas ")
        var h= readLine() !!.toDouble()
        var conver = h * vh
        var result =(conver * iva) - iva
        print("el salario de $nombre es $result")

}