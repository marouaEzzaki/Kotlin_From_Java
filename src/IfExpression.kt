fun main() {
    val n1 = 31
    val n2 = 20

    /**
     * In Kotlin, if statements can act as expressions that return values.
     * Similar to using 'return' in Java, but directly within the if block.
     * This means we can store the result of an if-else check in a variable for example.
     */

    val value = if (n1 >= n2 && n1 <= 30) {
        println("Condition is True")
        ":)" // Acts like a return statement, providing a result to 'value'

    } else {
        println("Condition is False")
        ":(" // Return alternative when the condition is false
    }

    println("Result of the if expression: $value")

    println("End of the program")
}