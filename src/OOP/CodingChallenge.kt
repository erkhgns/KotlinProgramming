package OOP

//Create a class representing a book. Every book has a title, an author, a
//publication year and is either borrowed or not. Choose an appropriate
//data type for each of these properties.
//A book can be borrowed from you or returned to you. In both cases, the
//borrowed property is updated accordingly. Also, a book should be able
//to print itself to the command line, including its title, author, and
//publication year.
class Book(private val title: String,private  val author: String ,private  val year: Int){

    var borrowed: Boolean = false

    fun getInformation (): String{
        return "Title of the book: $title \n author: $author \n Year published: $year"
    }
    fun borrowBook(): String{
        return if(borrowed)
            "Book is borrowed"
        else
            "Borrowed successfully"
    }
    fun surrenderBook(): String{
        return if(borrowed)
            "Surrender succesfully"
        else
            "Failed"
    }
    
    

}

fun main(args: Array<String>) {
   val book = Book("Himym","ERICK",1998)
    println(book.getInformation())
    println(book.surrenderBook())
    println(book.borrowBook())



}