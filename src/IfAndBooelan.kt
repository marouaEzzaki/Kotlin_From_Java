fun main() {

    // When dealing with nullable booleans, you need to specify Boolean?
    // and then check if it's true using '== true' to handle the null case.
    val isAdult: Boolean? = null

    // If 'isAdult' is both non-null and true, this block executes.
    // The condition is written as 'isAdult == true' to avoid null pointer exceptions.
    // (In Java, you'd use separate checks for null since boolean can't be nullable).
    if (isAdult == true) {
        println("not null and true")
    } else {
        println("false or null")
    }
}
