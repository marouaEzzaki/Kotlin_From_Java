fun main() {

    // Arrays work similarly in Java, allowing us to store multiple values.

    // Syntax changes slightly in Kotlin there is no [] for arrays:
    val names = arrayOf("Yasmina", "Maroua", 2)
    // If you want to prevent other data types, you can specify it: arrayOf<Type>()

    println(names.contentToString())  // To print the content of the array
    println(names[0])  // To print a specific value, use [i] (same as in Java)
    names[2] = "Nadia"  // Reassign values in the same way as in Java

    println(names.size)  // To get the length of out array

    if ("hello" in names) {  // Check if "hello" is in the array
        println("found")
    } else {
        println("not found")
    }

    // Arrays, like in Java, are fixed in size. They can't be resized.

    val arrayOfNulls = arrayOfNulls<String>(5)  // Create an array of nulls with a specified size
    println(arrayOfNulls.contentToString())

    val emptyArray = emptyArray<String>()  // Create an empty array (LENGTH = 0)
    println(emptyArray.contentToString())

    val intArray = intArrayOf(2, 3, 45)  // Create an array of Ints
    println(intArray.contentToString())

    arrayOfNulls.fill("*")  // Fill arrayOfNulls with a specific value
    println(arrayOfNulls.contentToString())
}
