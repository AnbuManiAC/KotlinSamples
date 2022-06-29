

object CustomerData {
    var name = "Jean"
    fun typeofCustomer() = "Indian"
}

data class Book(var name: String, var price: Int)

//Signleton class Only one instance
object BookShelf
{
    var books = arrayListOf<Book>()

    fun showBooks()
    {
        for (book in books) println(book)
    }
}

val world = object {
    val hello = "Hello"
    val world = "world"

    override fun toString() = "$hello $world"
}

interface ButtonClickListner{
    fun onClick()
    fun onLongClick()
}

interface Programmer{
    fun think()
}

fun main(){
    println(CustomerData.name)
    CustomerData.name = "Snow"
    println(CustomerData.name)
    println(CustomerData.typeofCustomer())


    BookShelf.books.add(Book("Java",200))
    BookShelf.books.add(Book("Kotlin",300))
    BookShelf.books.add(Book("Swift",340))
    println(); println()
    BookShelf.showBooks()

    var programmer: Programmer = object : Programmer
    {
        override fun think() {
            println("Think logically")
        }
    }
    programmer.think()

    println(world)

    val wecanusethisanywherewewant = object : ButtonClickListner{
        override fun onClick() {
            println("Button clicked")
        }

        override fun onLongClick() {
            println("Button long press")
        }

    }

}