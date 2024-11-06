fun main() {
    /**
     * Like in java, the difference between lists and arrays
     * is that lists are expandable whereas with arrays
     * once ypu define the size, you are no longer able
     * to expand its size
     */

    //LISTOF CREATES A READ-ONLY LIST
    val list : List<String> = listOf("Maroua", "Mercedes")

    val list2 = listOf("Maroua", "Mercedes")//you can omit the type declaration

    println(list[0])//para acceder a un elemento específico
    println(list.get(0)) //otra forma de acceder
    println(list.size)//cuantos elementos tiene la lista
    println(list.contains("Maroua"))
    println(list)

    //You can add more elements, but you need to use another constructor
    //mutableListOf <- this gives the flexibility to add and remove values
    val names = mutableListOf<String>(
        "Anas",
        "Imran",
        "Younes",
        "Ayoub"
    )
    println(names)
    names.add("Anwar")
    println(names)
    names.remove("Ayoub")
    println(names)

    /**
     * listOf: Lista inmutable, no puedes cambiar ni el tamaño ni el contenido.
     * mutableListOf: Lista mutable, permite cambiar tanto el tamaño como el contenido.
     * Array: Tamaño fijo (no se puede cambiar el tamaño), pero permite cambiar los valores de sus elementos.
     */

    val message = mutableListOf<Any>()
    println(message.isEmpty())
}
