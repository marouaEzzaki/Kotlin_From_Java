fun main() {
    val isAdult = true
    val isFemale = false
    val isDriver = true

    // Logical operators (&&, ||, !) work the same as in Java
    println(isAdult && isFemale)  // Both must be true to return true
    println(isAdult && (isFemale || isDriver))  // True if isAdult is true and either isFemale or isDriver is true
    println(isFemale || isAdult)  // True if at least one of them is true
    println(!isAdult)  // Negation, returns the opposite of isAdult
    println(!isFemale) // Negation, returns the opposite of isFemale
}