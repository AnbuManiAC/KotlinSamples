
fun interface EvenFilter{
    fun filter(i: Int) : Boolean
}

interface Printer {
    fun print()
}

fun Print(block: () -> Unit): Printer = object : Printer { override fun print() = block() }

fun interface Printer1{
    fun print()
}

fun main(){
    val isEven = EvenFilter { it%2 == 0 }
    println("Is 6 Even  -  ${isEven.filter(6)}")
    println("Is 7 Even  -  ${isEven.filter(7)}")

    Print { println("dnfjsnsdjf")}.print()

    Printer1 { println("jdjnj") }.print()
}