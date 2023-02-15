// condicionales multiples con when
// fun main(){
//     var dayNum= 5
//     when(dayNum){
//         1->println("Lunes")
//         2->println("martes")
//         3->println("miercoles")
//         4->println("jueves")
//         5->println("viernes")
//         6->println("sabado")
//         7->println("domingo")
//         else -> println("dia invalido")
//     }
// }
fun main(){
    print("ingrese las horas trabajadas")
    var ht = readLine()!!.toFloat()    
    val tarifaHora=2000
    var salBase= ht * tarifaHora
    var salDes = salBase-(salBase*0.1)
    print("Ingrese el tipo de empleado") 
    var tipoE = readLine()
    when (tipoE){
        "a","A"->{
            var aument = (salDes*0.3)+salDes
            print("Usted es tipo 'A', tiene un aumento de 30%, el salario Final es: $aument")
            print("el salario base es: $salBas")   
        }
        "b","B"->{
            var aument = (salDes*0.2)+salDes
            println("Usted es tipo 'B', tiene un aumento de 20%, el salario Final es: $aument") 
            print("el salario base es: $salBas")   
        }
        "c","C"->{
            var aument = (salDes*0.1)+salDes
            print("Usted es tipo 'C', tiene un aumento de 10%,el salario Final es: $aument")
            print("el salario base es: $salBas")   

        }
        else ->{
            print("Usted no tiene tipo ,no hay un aumento,tu salario final es $salDes")
        }
    }
    

}
// fun main(){
//     var menu="""
//     Menu de opciones 
//     1.Saludar
//     2.Pedir nombre de una persona
//     3.sumar 2 numeros
//     Ingrese una opcion: """
//     print(menu)
//     var op = readLine()!!.toInt
//     when (op){
//         1->{
//             print("Hi, im mariana, nice to meet u")
//         }
//         2->{
//             print("Ingresa tu nombre")
//             var name = readLine()
//             print("tu nombre es: $name")
//         }
//         3->{
//             print("ingresa el primer numero: ")
//             var n1= readLine()
//             print("ingresa el segundo numero: ")
//             var n2= readLine()
//             var add= n1+n2
//             print(" la suma de los numeros $n1 y $n2 es: $add")
//         }
//         else{
//             print(" ingrese una opcion valida")
//         }
        
//     }
// }
//condicionales múltiples con when
// fun checkNumber() {
// var num=-8
// when (num) {
// 0 -> println("El número es 0")
// 1, 2, 3 -> println("El número está entre 1 y 3")
// in 4..10 -> println("El número está entre 4 y 10")
// else -> println("El número no se encuentra")
// }
// }