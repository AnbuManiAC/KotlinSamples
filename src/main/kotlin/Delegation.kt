

interface DelInterface{
    fun someMethod() : String
    val someVariable : String
}

class DelInterfaceImp : DelInterface{

    override val someVariable: String = "Variable from DelInterfaceImp"
    override fun someMethod(): String {
        return "Method from DelInterfaceImp"
    }
}

class MyDerivedClass(myInterface: DelInterface) : DelInterface by myInterface{
    override val someVariable: String = "Variable from MyDerivedClass"
}

fun main(){
    val delInterfaceImp = DelInterfaceImp()
    val myDerivedClass = MyDerivedClass(delInterfaceImp)

    println(myDerivedClass.someMethod())

    println(delInterfaceImp.someVariable)
    println(myDerivedClass.someVariable)
}
