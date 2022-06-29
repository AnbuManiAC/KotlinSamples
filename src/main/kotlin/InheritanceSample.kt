import kotlin.reflect.KMutableProperty1

open class Animal(var color:String) {
    init {
        println("From animal Init: $color")
    }
}

class Dog(color :String, var breed:String): Animal(color){
    init {
        println("From dog Init: $color and $breed")
    }
}

fun main(){
   val dog = Dog("White", "Lab")

    val derived = Derived(1)


    Child("hello", "world")

}

/////////////////////

open class Base {
    constructor(arg0: Int) :this(arg0,2)

    constructor(arg0: Int, arg1:Int)

    open val prop :Any = "Hello"
    open lateinit var prop1 : Any
}

class Derived : Base {
    constructor(arg0:Int) : this(arg0,1) //or super(arg0) or super(arg0,1)

    constructor(arg0:Int, arg1:Int) : super(arg0,arg1)

//    override var prop =1
    override var prop1: Any = 2 .also { println(super.prop) }


    open fun printSomething() = println("something")
}

open class Parent(val name: String){
    init {
        println("Initializing base class")
    }

    open val size: Int =
        name.length.also { println("Initializing size in base class : $it") }

}

class Child(name:String, val lName: String)
    : Parent(name.replaceFirstChar { it.uppercase() }.also { println("Argument for base class : $it") }){

    init {
        println("Initializing derived class")
    }

    var hi :Int get() = 2
        private set(value){}


    override val size: Int =
        (super.size + lName.length).also { println("Initializing size in derived class : $it") }
}

open class Rectangle {
    open fun draw() { /* ... */ }
}

interface Polygon {
    fun draw() {
        println("In polygon interface")
    }
}

class Squares() : Rectangle(), Polygon {
    override fun draw() {
        super<Polygon>.draw()
    }
}
