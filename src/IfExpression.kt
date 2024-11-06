fun main() {
    val n1 = 31
    val n2 = 20

    /**
     * Las expresiones if pueden devolver un valor
     * es como poner un return
     * Puedes guardar el valor e una variable
     */
    val value = if (n1 >= n2 && n1 <= 30) {
        println("True")
        ":)" //es como si tuviera un return

    } else {
        println("False")
        ":("
    }

    println(value)

    println("some code")
}