fun main() {
    val number = "10"
    println(10 + number.toInt())//para convertir el string a int

//  println(10.toString() + number) -> es mejor usar el String template

    println("10$number")
    val d = 3.0
    println(d)
    println(d.toInt())//3
}