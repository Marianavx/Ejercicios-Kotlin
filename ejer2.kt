// condicionales simples 
fun main(){
    print("ingrese el nombre del estudiante")
    var nombre = readLine()
    print("ingrese el nombre de la materia")
    var materia = readLine()
    print("ingrese la primera nota")
    var n1= readLine()!!.toFloat()
    print("ingrese la segunda nota")
    var n2= readLine()!!.toFloat()
    print("ingrese la tercer nota")
    var n3= readLine()!!.toFloat()
    var notaFinal =(n1+n2+n3)/3
    print("el promedio final de $nombre en la materia $materia es : $notaFinal\n")
    if (notaFinal < 3.5) {
        print("el estudiante $nombre perdio la materia")
    }
}