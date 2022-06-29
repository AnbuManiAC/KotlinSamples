
interface MyInterface{

    val prop:Int
    val prop1:Int get() = 1

    fun abstractFun()

    fun definedFun(){
        println("This function is defined in interface itself")
    }
}

class MyInterfaceImpl : MyInterface{

    override val prop: Int get() = 1
    override val prop1: Int
        get() = super.prop1

    override fun abstractFun() {
        println("Abstract fun is implemented in MyInterfaceImpl class")
    }

    override fun definedFun() {
        super.definedFun()
    }
}

interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String

    override val name: String get() = "$firstName $lastName"
}

interface A{
    fun one() = println("A One")
    fun two()
}

interface B{
    fun one() = println("B One")
    fun two() = println("B Two")
}

class C : A{
    override fun two() {
        println("Two")
    }
}

class D: A,B {
    override fun one() {
        super<A>.one()
        super<B>.one()
    }

    override fun two() {
        super<B>.one()
    }
}

class Worker(override val firstName: String, override val lastName: String, val position: String) : Person {
    init {
        println("$firstName, $lastName, $position")
    }
}

fun main(){

}

