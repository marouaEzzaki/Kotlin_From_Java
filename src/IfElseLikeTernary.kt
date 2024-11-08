fun main() {
    val n1 = 19
    val n2 = 20

    // Kotlin doesn't have a ternary operator like Java's `? :` operator.
    // Instead, we use an if-else expression directly to assign values.
    val v = if (n1 >= n2) ":)" else ":("

    println(v)

    // Kotlin allows multiple conditions in an if-else chain as an expression.
    val v1 = if (n1 >= n2) ":)"
    else if (n1 == 100) "hooray"
    else if (n1 == 200) "hooray 200"
    else ":("

    println(v1)
}