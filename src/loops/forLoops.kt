package loops

fun main(args: Array<String>) {


    //loop from 1 - 10
//    for(i in 1..10){
//        println(i)
//    }


   // val list = listOf("JAVA","KOTLIN","PYTHON")
    //iterate each value of list where i is variable name
//    for(i in list){
//        println(i)
//    }


    //loop through list together with index of list
//    for((index,value) in list.withIndex()){
//        println("index is $index and value is $value")
//    }



    //loop while condition is true
    //loop number from 9-0
//    var num: Int = 9;
//    while(num>=0){
//        println(num)
//        num--;
//    }


    //loop will end when 'break'
    // operator was called
//    for (c in "python"){
//        if(c == 'o'){
//            break
//        }
//        print(c)
//    }

//    val list = listOf("JAVA","KOTLIN","PYTHON")
//    for(i in list){
//        if(i.contains('A')){
//            continue
//        }
//        println(i)
//    }

    var sum: Double = 0.0

    for(i in 100..100000){
        sum+=i
    }
    println(sum)



}
