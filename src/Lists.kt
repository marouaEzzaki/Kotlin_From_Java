fun main() {
    /**
     * Like in Java, the key difference between lists and arrays is that lists are
     * expandable, whereas arrays have a fixed size. Once you define the size of an array,
     * you cannot change it. In contrast, lists in Kotlin can grow or shrink in size dynamically.
     */

    // listOf creates a read-only list (immutable)
    val list: List<String> = listOf("Maroua", "Mercedes")

    val list2 = listOf("Maroua", "Mercedes") // You can omit the type declaration if it can be inferred

    // Accessing specific elements in the list
    println(list[0]) // Accessing element by index (zero-based)
    println(list.get(0)) // Alternative way to access an element (same result as using [])
    println(list.size) // Returns the number of elements in the list
    println(list.contains("Maroua"))
    println(list)

    // To modify a list (adding or removing elements), use a mutable list
    //mutableListOf <- this gives the flexibility to add and remove values
    val names = mutableListOf<String>("Anas", "Imran", "Younes", "Ayoub")
    println(names)
    names.add("Anwar")
    println(names)
    names.remove("Ayoub")
    println(names)

    /**
     * Differences:
     * - listOf: Immutable list, meaning you cannot change the size or contents once defined.
     * - mutableListOf: Mutable list, allows you to change the size and content.
     * - Array: Fixed size array, but allows modification of individual elements. Cannot resize.
     */

    // Creating a mutable list with a generic type
    val message = mutableListOf<Any>()
    println(message.isEmpty())
}
