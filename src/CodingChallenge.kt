fun main(args: Array<String>) {

//    Create an array list of your favorite book titles. Loop over this list and, if
//    the title contains the letter ‘e’, print each character of the name on a new
//    line.
    val listOfBooks = arrayListOf("how i met your mother","friends","brooklyn 99","Lucifer")


    for(i in listOfBooks){
        if(i.contains("e")){
            for (char in i){
                print(char)
            }
            println()
        }
    }
}