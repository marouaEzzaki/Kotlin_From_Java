const val PI = 3.14 // static final
//that value is knows before code execution

fun main() {

    /**
     * DIFFERENCES BETWEEN VAL AND VAR
     *
     *  VAR = you can change the content of the variable once its being assigned
     *
     *  VAL = once its assigned you cant change the value (FINAL)
     *
     */

    var brandVar= "MarouaCode"
    brandVar = "Something else"

    val brandVal = "MarouaCode"
   //brandVal = "Something else"


    val name = "Jamal" //read only. final
    var i = 0 //mutable

    //const val PI = 3.14 // static final (da error pq lo tienes q crear fuera
                        //de una funcion ) y el valor se tiene que saber antes
                        //de ejecutar el codigo


}

fun getPiValue() : Double = 3.14
