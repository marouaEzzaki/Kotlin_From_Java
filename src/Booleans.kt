fun main() {
    val isAdult = false
    val isMale = true
    val isOrderCompleted: Boolean? = null // To allow null, specify the type and add '?'

    /**
     * Best practice: there’s a naming convention for booleans—
     * variables should start with 'is...' to indicate a true/false state.
     * Whenever working with booleans, you always want to ask a question.
     */
    println(isAdult)
    println(isMale)
    println(isOrderCompleted)

    // Example variable names: hasSlept, isCompleted
}
