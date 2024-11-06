fun main() {
    //en Kotlin no hay = new SmartDevice()
    val  tv = SmartDevice("Samsung Tv", 1000.0)
    //tv.brand = "Samsung Tv"
    //tv.price = 1000.0

    println("${tv.brand} ${tv.price}")// al sobreescribir el toString solo imprime el objeto
    tv.turnOn()
    tv.getDeviceSate()

    println()


    val  tv2 = SmartDevice("Samsung Tv", 1000.0)
    tv2.turnOn()

    //println(tv == tv2) -> para que == funcione correctamente, la clase debe sobreescribir el método equals()
    //triple === -> same place in memory
    //to check whether the content of the two tvs whe have to override the equals and hashcode

    println("Son iguales tv y tv2 == ? ${tv == tv2}") //da true porq hemos sobreescrito equals()
    println("Son iguales tv y tv2 === (memory location ) ? ${tv === tv2}")//da false porq esta comparando sus refencias de memoria


    println()

    val  phone = SmartDevice("Apple Iphone")
    //phone.brand = "Apple Iphone"
    phone.price = 1200.0
    println("${phone.brand} ${phone.price}")

    phone.turnOff()
    phone.getDeviceSate()

    println()
    val laptop = SmartDevice()
    laptop.brand = "Macbook M3 pro"
    laptop.price = 2500.0

    println("${laptop.brand} is $laptop.price")//instead of doing all of this hacemos el override de toString
}

//blueprint
                //no hace falta poner la palabra constructor
class SmartDevice constructor(//todas las propiedades van dentro del constructores ahora
    //properties -> attributes (var or val)
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false
){

    //para crear mas constructores
    constructor() : this("", 0.0)
    constructor(brand: String) : this(brand, 0.0)


    //behaviours -> functions / methods
    fun turnOn () {
        isSwitchedOn  = true
        println("$brand is switching on ..")
    }


    fun turnOff () {
        isSwitchedOn = false
        println("$brand is  switching off ..")
    }

    fun getDeviceSate () {
        println("$brand is on ? :  $isSwitchedOn")
    }

    //igual que en java solo cambia la sintaxis
    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }
}