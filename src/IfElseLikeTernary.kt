fun main() {
    val n1 = 19
    val n2 = 20
//  var v = n1 >= n2 ? ":)" : ":(" el operador ternario en java
    val v = if (n1 >= n2) ":)" else ":(" //usar el if-else como expresion

    println(v)
    
    val v1 =
        if (n1 >= n2) ":)"
        else if (n1 == 100) "hooray"
        else if (n1 == 200) "hooray 200"
        else ":("

}