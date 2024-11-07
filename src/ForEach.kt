fun main() {
    // Creating an immutable list in Kotlin using listOf, which is similar to Java's List.of()
    val names = listOf(
        "Maroua",
        "Nadia",
        "Yasmina",
        "Fahd"
    )

    // Using forEach with a lambda function to print each name. This is more idiomatic in Kotlin.
    names.forEach { name -> println(name) }

    // The line above is equivalent to the traditional for loop below:
    // for (name in names) println(name)
    // Both approaches iterate over the list elements, but forEach is more concise and functional
}