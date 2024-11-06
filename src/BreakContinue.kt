fun main() {

    val nums = intArrayOf(1,2,3,4,5,6,7,8)

    for (n in nums){
        if (n%2 ==0) {
            println(n)
            continue //to skip specific numbers -> skip whatever comes and then go back to the next iteration
        }

        if (n >5){
            break //exit the loop

        }


    }
    println("some other code")

    //break and continue are only allowed in loops
    /*
    nums.forEach {
        if (it == 2){
            continue
        }
    }
    
     */

}