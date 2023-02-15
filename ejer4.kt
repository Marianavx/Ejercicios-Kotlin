// condicionales multiples(anidados)
fun main(){
    print("ingrese el sueldo del operario")
    var sueldo= readLine()!!.toFloat()
    print("ingrese los años de antiguedad del operario")
    var anos = readLine()!!.toFloat()
    if (sueldo < 500 && anos >= 10){
        var desc = (sueldo *0.2)
        desc+=sueldo
        print("como usted lleva mas de 10 años de antiguedad se le aumenta 20%, el salario es: $desc")
    }
     else if (sueldo < 500 && anos < 10){
        var desc = (sueldo *0.05)
        desc+=sueldo
        print("como usted lleva menos de 10 años de antiguedad se le aumenta 5%, el salario es: $desc")
    }
    else{
        print("usted no tiene nigun descuento, su salario es de $sueldo")
    }


}