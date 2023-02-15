// condicionales dobles
fun main(){
    print("ingrese el nombre del CLIENTE")
    var nombre = readLine()
    print("ingrese el total de su compra")
    var vc = readLine()!!.toFloat()
    if(vc > 100000){
        var desc= 0.5
        var total = vc-(vc* desc)
        print("$nombre usted tiene un descuento del 50% entonces el total de su compra es: $total ")
    }
    else{  
        var desc= 0.1
        var total = vc-(vc* desc)
        print("$nombre usted tiene un descuento del 10% entonces el total de su compra es: $total ")
    }
}