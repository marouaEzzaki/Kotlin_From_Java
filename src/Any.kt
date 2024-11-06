fun main() {
    // Any is a type in Kotlin from which all other types inherit.
    // It is similar to Object in Java, but it can be used as a type to hold any data type.

    // Not a recommended practice, but if you ever see it, now you know.

    var number: Int = 10           // Int type variable
    var name: String = "Jamila"     // String type variable

    var number2: Any = 10           // Any type variable, holding an Int value
    var name2: Any = "Jamila"       // Any type variable, holding a String value

    // You can also assign other types to variables of type Any
    var anyValue: Any = 3.14        // Now it's holding a Double

    // Even though it's of type Any, you may need to cast it back to its original type
    if (anyValue is Double) {
        println("The value is a Double: $anyValue")
    }
}
