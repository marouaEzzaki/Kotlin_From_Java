fun main() {


    /**
     * If you want that a variable can be null you have to
     * specify the data type and add a question mark : '?'
     */
    var brand : String? = "MarouaCode"

    /**
     * el ?. es un operador de "safe call" que
     * permite ejecutar el metodo uppercase() solo si brand no es null.
     */
    println(brand?.uppercase())

    brand = null

    //println(brand?.uppercase())
    var name = "Maroua"



}