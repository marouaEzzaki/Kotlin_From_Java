fun main() {

    val names = arrayOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )

    // In Java, you would assign elements by indexing:
    val jamila = names[0]
    val jamas = names[1]

    // In Kotlin, destructuring makes it simpler.
    // Elements are assigned in order to the variables in parentheses:
    val (first, second, third) = names
    println(first)
    println(second)
    println(third)

    // To skip a value, use an underscore (_). 
    // The underscore represents a skipped variable that you cannot use later.
    // This works with arrays, lists, and other destructurable collections.
    val (name1, name2, _, name4) = names
    println("$name1, $name2, $name4")
}
