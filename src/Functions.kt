import java.util.*

fun main(args: Array<String>) {
    printWithSpaces("Kotlin")
    println(getCurrentDate())
    println(getMaximumValue(10,5))
}
//simple functions
fun printHelloWorld() {
    print("Hello, World")
}
//function with parameter
fun printWithSpaces(content: String) {
    for (c in content) {
        print("$c ")
    }
}
//function that returns value
fun getCurrentDate(): Date {
    return Date()
}
//function with parameter and return value
fun getMaximumValue(a: Int, b: Int): Int {

    if (a > b) {
        return a
    } else {
        return b
    }

}