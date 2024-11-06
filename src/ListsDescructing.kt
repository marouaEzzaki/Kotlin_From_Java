fun main() {

    val  names = arrayOf(
        "Jamila",
        "Jamas",
        "Saleh",
        "Peter"
    )

    //para asignar elementos de los indices en variables separadas en java
    //lo harías asi, creando la variable e  igualandolo accediendo con
    //corchetes al index :
    val j = names[0]
    val ja = names[1]

    //en kotlin se hace de esta manera
    //en orden se asignaran los valores a las variables
    //que pongas entre parentesis :
    val (one, two, three) = names
    println(one)
    println(two)
    println(three)

    //to skip a value we use underscore,
    //and you can't access _ later (it is not a variable)
    //it works with arrays,lists ...
    val(uno, dos, _, tres) = names
    println("$uno $dos $tres")


}