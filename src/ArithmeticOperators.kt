import kotlin.math.max
import kotlin.math.min
import kotlin.math.PI

fun main() {

    val number = 10
    val number2 = 2

    println("The result is: ${number + number2}")

    println("The value of Pi is: ${kotlin.math.PI}")  // Using PI explicitly

    println(max(number, number2))
    println(min(number, number2))  
    println(PI)  // Now you can use PI directly because it's imported

    var numberInc = 10
    println(++numberInc) // 11
    println(numberInc++) // 11 (first prints, then increments)
    println(numberInc) // 12
}
