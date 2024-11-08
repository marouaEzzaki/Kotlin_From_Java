fun main() {
    // Demonstrates calling functions with and without parameters in Kotlin
    println("hello from the main".uppercase())

    greet()

    greetMessage("Maroua") // what you pass is called an argument and the function itself has parameters
    greetMessage("Yasmina")
    greetMessage("Bob")

    println("\ngreetMessageAge")

    greetMessageAge("Yasmina", 14)
    greetMessageAge("Maroua", 19)
    greetMessageAge("Nadia", 39)

    // Named arguments :  allow specifying each argument with the parameter's name
    // This improves readability, especially in functions with many or optional parameters
    greetMessageAge(age = 24, name = "Fahd")
    greetMessageAge(name = "X", age = 20)

    greetMessageAgeDefaultValue(name = "ali") // Calls with a default parameter for age

    foo(bar = {
        println("bar as a function")
    })

    foo(bar = {
        greet()
    })

    foo {
        greetMessage(name = "fooo")
    }

    println(double(2))
    println(doubleSimplified(10))
}

// to create a function use fun keyword
fun greet(): Unit { // Using Unit is optional, similar to void in Java
    println("hii from a function 👋")
}

fun greetMessage(name: String) {
    println("hi $name 😝")
}

fun greetMessageAge(name: String, age: Int) {
    println("hi $name 😝")
    if (age >= 18) println("$name is an adult") else println("$name is not an adult")
}

fun greetMessageAgeDefaultValue(name: String, age: Int = -1) {
    println("hi $name 😝")
    if (age == -1) println("age not provided")
    return //Everything that comes after this line will not be executed
    if (age >= 18) println("$name is an adult") else println("$name is not an adult")
}

fun foo(bar: () -> Unit) { // Takes a function (lambda) as a parameter
    println("bar function")
    bar()
}

fun double(n: Int): Int {
    return n * 2
}

// Simplified syntax for single-expression function
fun doubleSimplified(n: Int): Int = n * 2

//You can return more than one value and data type in Kotlin :
fun twoValues(): Pair<String, Int> {
    return "Maroua" to 20
}
fun threeValues(): Triple<String, Int, Char> {
    return Triple("Maroua", 20, 'M')
}