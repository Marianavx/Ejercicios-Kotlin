//ciclo while
fun main(){

    var op =0
    while(op != 5){
    print("Ingrese el primer numero")
    var a = readLine()!!.toFloat()
    print("ingrese el segundo numero")
    var b = readLine()!!.toFloat()
    var menu = """
    MENU DE OPCIONES 
    1.Sumar
    2.Resta
    3.Multiplicar
    4.Dividir
    5.Finalizar
    ingresa una opcion """
    print(menu)
    op=readLine()!!.toInt()
        when(op){
        1 -> println("la suma de los numeros $a y $b es: ${a + b}")
        
        2 -> println("la resta de los numeros $a y $b es: ${a - b}")
        3 -> println("la multiplicacion de los numeros $a y $b es: ${a * b}")
        4 -> {
            if(a > 0){
                println("la division de los numeros $a y $b es:${a / b}")
            }else{
                println("la division de los numeros no puede ser negativo o igual a cero")
            }
        }
        5 -> println("programa finalizado")
        else -> println ("opcion invalida")
        

    }
 }
}