fun main() {
    val isAdult = true
    val isFemale = false
    val isDriver = true

    println(isAdult && isFemale) //both have to be true
    println(isAdult && (isFemale || isDriver)) // si adult es true y (isFemale o isDriver es tru)
    println(isFemale || isAdult) // si uno de los dos es true
    println(!isAdult)//
    println(!isFemale)
}