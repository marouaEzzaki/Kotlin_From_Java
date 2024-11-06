fun main() {
    /*
    Una empresa que gestiona un parque acuático te solicita una aplicación que les
    ayude a calcular el importe que hay que cobrar en la taquilla por la compra de una
    serie de entradas (cuyo número será introducido por el usuario). Existen dos
            tipos de entradas: infantiles, que cuestan 15.50€ y de adultos, que cuestan 20€.
    En el caso de que el importe total sea igual o superior a 100€, se aplicará
    automáticamente un bono de descuento del 5%.
    **/

    val precioENtradaInfantil = 15.50
    val precioEntradaAdulta = 20

    print("Cantidad de entradas infantiles : ")
    val numEntradasInfantiles = readln().toInt()

    print("Cantidad de entradas adultas : ")
    val numEntradasAdultas = readln().toInt()

    val precioBruto = (numEntradasAdultas*precioEntradaAdulta) + (numEntradasInfantiles*precioENtradaInfantil)

    val descuento = precioBruto*0.05
    val precioNeto = if(precioBruto >= 100) {
        precioBruto - descuento
    }else{
         precioBruto
    }

    println("Importe entradas : $precioBruto €")
    println(if (precioBruto >= 100) "Descuento : $descuento " else "Descuento : 0.00€ ")

    println("Importe entradas : $precioNeto €")
}