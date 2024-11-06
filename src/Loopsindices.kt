fun main() {
    val letters = charArrayOf(
        'A', 'B', 'C', 'D', 'E')

    for(c in letters) println(c)


    for(index in letters.indices){//to get the positions
        println("$index - ${letters[index]}")
    }


    println("reverse")
    for(index in letters.indices.reversed()){ //para imprimir la cadena al reves
        println("$index - ${letters[index]}")
    }


}