package conditions

import kotlin.random.Random

fun main(args: Array<String>) {


    val random = Random.nextInt(1,50);

    //when condition can return any values
    println( when (random){
        in 1..10 -> "random number is 1-10"
        in 11..20 -> "random number is 11-20"
        in 21..30 -> "random number is 21-30"
        in 31..40 -> "random number is 31-40"
        in 41..50 -> "random number is 41-50"
        else ->  "error"
    })
    println("Actual number is $random")
}