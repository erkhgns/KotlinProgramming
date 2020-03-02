package OOP

//Simple Object
class Person{
    var name: String = "Erick"
    var age: Int = 21

    //functionality in Object
    fun speak(){
        println("Hello")
    }

    fun greet(name: String){
        println("Hello, $name !!")
    }

   /* fun getYearOfBirth() :Int{
        return 2020-age;
    }*/

    //simplified function compare to the function above
    fun getYearOfBirth() = 2020 - age
}

//class with Constructor
class Car(var color: String, var price: Double){

    //this keyword is triggered every time a new object is created
    //You can also get the Properties defined in Constructor in this keyword
    init{
        println("Car Object is created")
    }

    fun getHalfOfPrice(): Double{
        return price/2
    }

}

fun main(args: Array<String>) {

    //() tells Kotlin to instantiate a new object

    val person = Person()
    println(person.age)
    println(person.name)
    person.speak()
    person.greet("Princess")
    println(person.getYearOfBirth())

    val car = Car("Red",5000.00)

    println(car.getHalfOfPrice())


    //change property of an object
//    person.age = 22
//    println(person.age)
}

