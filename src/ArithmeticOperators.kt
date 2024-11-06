import kotlin.math.max
import kotlin.math.min

fun main() {

    val number = 10
    val number2 = 2

    println("El resultado es : ${number + number2}")

    println("el numero pi es : ${kotlin.math.PI}")

    println(max(number,number2))
    println(min(number,number2))
    println(PI)

    var numberInc = 10
    println(++numberInc) //11
    println(numberInc++) //11 (primero imprime luego incrementa)
    println(numberInc) //12

}