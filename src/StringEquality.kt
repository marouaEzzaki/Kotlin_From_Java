fun main() {

    val name1 = "Saleh"
    val name2 = "Jamila"
    val name3 = String("Saleh".toCharArray())//creating a string through constructor

    //double and equals are comparing the content
    println(name1 == name3)

    //this compares the memory location (if it passed w a String constructor)
    println(name1 === name3)
    println(name1.equals(name3))


}