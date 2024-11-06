/***
 * To learn the Kotlin syntax
 */
fun main() {

    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1,2,3,4,5)

    for (name in names){

        val n = name.replaceFirstChar {
            it.uppercase()
        }
        println(n)
    }

    for (number in numbers) println(number)

    for (i in 1..10) println(i)

}