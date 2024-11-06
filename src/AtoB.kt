fun main() {
    val number = "10"

    // Convert string to int and add to another integer
    println(10 + number.toInt()) // Converts the string "10" to an int and adds it to 10

    // It's better to use a String template rather than concatenation with .toString()
    println("10$number")  // Outputs "1010" as a single string using String template

    val d = 3.0
    println(d)           // Prints the double value 3.0
    println(d.toInt())    // Converts double to int, truncating to 3
}
