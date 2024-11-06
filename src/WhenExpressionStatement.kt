fun main() {

    //in java we have the switch statement

    //in kotlin we have when, which can be used as a statement or expression if it
    //returns a value

    val input = "M"

    //if it returns a value is an expression, otherwise is a statement
    val gender = when(input) {
        "F" -> "FEMALE" //es como poner un return y asignarselo a "gender"
        "M" -> "MALE"
        else -> {
            "Unkown Gender"
        }
    }
    println(gender)
}