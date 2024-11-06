fun main() {

    //Works the same in Java, it allows us to store multiple values

    //The syntax changes, there's no []:
    val names = arrayOf("Yasmina", "Maroua",2) //if you want to prevent other data types
                                                //you can specify it : arrayOf<Type>()

    println(names.contentToString()) //to print the content of the array
    println(names[0]) //para imprimir un valor en especifico lo haces con [i] (same as java)
    names[2] = "Nadia" //igual que en java para reasignar valores

    println(names.size) //para saber la longitud de nuestro array

    if ("hello" in names){ //para ver si hello se encuenta dentro del array
        println("found")
    }else{
        println("not found")
    }

    //los arrays como en Java, no se pueden expandir o encoger, su tamaño es fijo


    val arrayOfNulls = arrayOfNulls<String>(5) //para crear un array de nulls

    println(arrayOfNulls.contentToString())

    val arrayVacio = emptyArray<String>()//crear un array vacio (LENGHT = 0)
    println(arrayVacio.contentToString())

    intArrayOf(2,3,45)//crear un array de ints

    arrayOfNulls.fill("*")
    println(arrayOfNulls.contentToString())

}