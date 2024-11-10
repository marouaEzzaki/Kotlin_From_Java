fun main() {

    // Simple range loop from 1 to 5 (inclusive)
    for (i in 1..5) println(i)

    println("reversed")
    // Loop in reverse from 5 down to 1
    for (i in 5 downTo 1) println(i)

    println("step")
    // Loop with a step of 2, skipping every second number from 1 to 5
    for (i in 1..5 step 2) println(i)

    println("step down")
    for (i in 5 downTo 1 step 2) println(i)
}
