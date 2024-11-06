fun main() {

    val name = "Maroua"

    println(name)
    println(name.uppercase())
    println(name.lowercase())
    println(name.length) //is a property not a method

    println(name[0]) //name.charAt(0)

    println(name.isNotBlank())


    val age = 20

   // var msg = name + age  this is not the right way

    val msg = "Name $name, Age :  $age" //this is the best way to do it
    println(msg)

    //To write multiline Strings, escribe tres veces comillas ("")
    //it also keeps the indentations (tabuladores y eso)
    val email = """
        Hello $name
           How 
        Are you
    """.trimIndent()

    println(email)

}