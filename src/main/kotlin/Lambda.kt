

class Lambda{
    fun addTwoNumbers(action: (Int,Int)->Unit){
        action(1,2)
    }
    fun addandShowTwoNumbers(a:Int, b:Int, action:(Int)->Unit){
        action(a+b)
    }
}

infix fun Int.greaterThanZero(filter: (Int)->Boolean){
    println(filter(this))
}

val stringPlus: (String, String) -> String = String::plus
val intPlus: Int.(Int) -> Int = Int::plus



fun main(){

    val myLambda: (Int,Int)->Unit = { a:Int,b:Int ->
        println(a+b)
    }
    Lambda().addTwoNumbers(myLambda)
    Lambda().addandShowTwoNumbers(2,3,{n:Int-> println(n) })
    Lambda().addandShowTwoNumbers(2,3) {println(it)}

    Lambda().addandShowTwoNumbers(3,4, fun(n:Int):Unit = println(n))
    Lambda().addandShowTwoNumbers(3,6) {fun(n:Int):Unit = println(n)}


    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))

    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))
    println(6.intPlus(2))

    -1 greaterThanZero { it>0 }
}