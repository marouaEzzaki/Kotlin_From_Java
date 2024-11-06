fun main() {
    // In Kotlin, we don't need 'new SmartDevice()' like in Java
    val tv = SmartDevice("Samsung Tv", 1000.0)

    println("${tv.brand} ${tv.price}") // When overriding toString, it prints the object state
    tv.turnOn()
    tv.getDeviceState()

    println()

    val tv2 = SmartDevice("Samsung Tv", 1000.0)
    tv2.turnOn()

    // In order to compare objects with ==, we need to override the equals() method
    // '===' compares memory references (if they point to the same object in memory)
    println("Are tv and tv2 equal == ? ${tv == tv2}") // Returns true because we override equals()
    println("Are tv and tv2 === (memory location) ? ${tv === tv2}") // Returns false because it's comparing references in memory

    println()

    val phone = SmartDevice("Apple Iphone")
    phone.price = 1200.0
    println("${phone.brand} ${phone.price}")

    phone.turnOff()
    phone.getDeviceState()

    println()

    val laptop = SmartDevice()
    laptop.brand = "Macbook M3 pro"
    laptop.price = 2500.0

    println("${laptop.brand} is $laptop.price") // Instead of doing all of this, we override toString
}

// Blueprint class
// No need to write 'constructor' explicitly
class SmartDevice constructor( // Properties go inside the constructor now
    var brand: String?,
    var price: Double?,
    var isSwitchedOn: Boolean = false // Default value for isSwitchedOn is false
) {
    // Additional constructors
    constructor() : this("", 0.0)
    constructor(brand: String) : this(brand, 0.0)

    // Behaviour functions (methods)
    fun turnOn() {
        isSwitchedOn = true
        println("$brand is switching on ..")
    }

    fun turnOff() {
        isSwitchedOn = false
        println("$brand is switching off ..")
    }

    fun getDeviceState() {
        println("$brand is on? : $isSwitchedOn")
    }

    // Overriding toString method
    override fun toString(): String {
        return "SmartDevice(brand=$brand, price=$price, isSwitchedOn=$isSwitchedOn)"
    }

    // Overriding equals to compare objects based on content
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SmartDevice

        if (brand != other.brand) return false
        if (price != other.price) return false
        if (isSwitchedOn != other.isSwitchedOn) return false

        return true
    }

    // Overriding hashCode to match equals
    override fun hashCode(): Int {
        var result = brand?.hashCode() ?: 0
        result = 31 * result + (price?.hashCode() ?: 0)
        result = 31 * result + isSwitchedOn.hashCode()
        return result
    }
}