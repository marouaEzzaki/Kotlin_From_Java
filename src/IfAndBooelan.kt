fun main() {

    //when you have null in your boolean you have to specify it
    //and check with == true
    val isAdult: Boolean? = null

    if (isAdult == true) {//is not null and true(in java this is redundant)
        println("not null and true")
    } else {
        println("false or null")
    }
}