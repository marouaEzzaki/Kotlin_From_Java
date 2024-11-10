/**
 * Learning Kotlin syntax for loops
 */
fun main() {

    val names = listOf("mary", "ali", "alex")
    val numbers = intArrayOf(1, 2, 3, 4, 5)

    // For-each loop to iterate over each name in the list
    for (name in names) {
        val capitalized = name.replaceFirstChar { it.uppercase() }
        println(capitalized)
    }

    /* Equivalent Java syntax:
       for (String name : names) {
           System.out.println(name);
       }
       In Kotlin, in works like : in Java's for-each syntax.
    */
    
    for (number in numbers) println(number)

    // For loop using a range to print numbers from 1 to 10
    for (i in 1..10) println(i)
}
