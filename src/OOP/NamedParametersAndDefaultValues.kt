package OOP

//With default value - can call the class without assigning
// value to constructor if property have a default value
class House(private val color: String, private val height: Double = 2.0, private val price: Int){


    fun getHouseInformation(): String{
        return "Height: $height\ncolor: $color\nprice: $price"
    }
}

fun main(args: Array<String>) {
    val house1 = House("Red",1.95,15)
    println(house1.getHouseInformation())

    //named parameters - assign value to property by defining properties name.
    // It can work in any order/arrangement
    val house2 = House(height = 2.50,price =90, color = "Yellow")
    println(house2.getHouseInformation())

    //height property have a default value so it is
    // not now required to assign value in property height
    val house3 = House(color = "Blue", price = 300)
    println(house3.getHouseInformation())
}