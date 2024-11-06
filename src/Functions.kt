fun main() {
    println("hello from the main".uppercase())

    greet()

    greetMessage("Maroua")//lo que le pasas se llama arguments y lo que tiene la fun es parametros
    greetMessage("Yasmina")
    greetMessage("Bob")

    println("\ngreetMessageAge")

    greetMessageAge("Yasmina", 14)
    greetMessageAge("Maroua", 19)
    greetMessageAge("Nadia", 39)

    //cada argumento se pasa junto con el nombre del parámetro correspondiente
   /* Puedes escribir los argumentos en cualquier orden porque cada uno especifica claramente
      a qué parámetro pertenece.
      Esto hace que el código sea más legible, especialmente
      si la función tiene muchos parámetros o parámetros opcionales (valores por defecto).
    */
    greetMessageAge(age=24, name = "Fahd")

    greetMessageAge( name = "X", age=20)

    greetMessageAgeDefaultValue(name="ali")

     foo(bar = {
        println("bar as a function")
    })

    foo(bar = {
        greet()
    })

    foo{
        greetMessage(name = "fooo")
}

    println( double(2))

    println(doubleSimplificado(10))

}

//fun <- to create a function
//nameFunction() {}

//JAVA
//public void greet(), Unit equals to void
fun greet () : Unit{//no poner nada es como poner un void
    println("hii from a function 👋")
}

fun greetMessage(name : String) {
    println("hi $name 😝")
}

fun greetMessageAge(name : String, age : Int) {
    println("hi $name 😝")
    if (age >=18) println("$name is an adult") else println("$name is not an adult")
}

fun greetMessageAgeDefaultValue(name : String, age : Int = -1) {
    println("hi $name 😝")
    if (age == -1) println("age not provided")
    return //everything that comes after this line will not be executed
    if (age >=18) println("$name is an adult") else println("$name is not an adult")
}


fun foo(bar : () -> Unit){
    println("bar function")
    bar()
}

fun double (n : Int ) : Int{
    return n*2
}

fun doubleSimplificado (n : Int ) : Int = n*2

fun twoValues() : Pair<String, Int>{
    return "Maroua" to 20
}

fun threeValues() : Triple<String, Int, Char>{
    return Triple("Maroua",
                20  ,
                'M')
}