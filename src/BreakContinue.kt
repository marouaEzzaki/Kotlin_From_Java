fun main() {

    val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8)

    // Iterate through each number in the array
    for (n in nums) {
        if (n % 2 == 0) {
            println(n)
            continue  // Skip the current iteration and move to the next one
        }

        if (n > 5) {
            break  // Exit the loop if a number greater than 5 is found
        }
    }
    println("some other code")

    // Note: 'break' and 'continue' are only allowed in loops
    /*
    nums.forEach {
        if (it == 2) {
            continue  // Skips the current iteration
        }
    }
    */
}
