fun main() {

    var number =1//tiene que ser var

    while (number <=5){
        println("Number $number")
        ++number
    }

    val brand = "MarouaCode"
    var index = brand.length-1
    var index2 = 0

    while (index >=0){
        println(" ${brand[index]}")
        --index
    }

    while (index2 <= brand.length-1){
        println("Letter ${brand[index2]}")
        ++index2
    }

    val brandArray = arrayOf("A", "m", "i")
    var index3 = 0
    while (index3<=brandArray.size-1){
        println(brandArray[index3])
        index3++
    }
}