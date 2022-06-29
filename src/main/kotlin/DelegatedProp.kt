

import kotlin.properties.Delegates
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

class Delegate {
//    private var delegated = "jddjdj"
//    operator fun getValue(example: Example, property: KProperty<*>): String {
//        return delegated
//    }
//
//    operator fun setValue(example: Example, property: KProperty<*>, s: String) {
//        delegated = s
//    }
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

val lazyValue: String by lazy(LazyThreadSafetyMode.NONE) {
    println("computed!")
    "Welcome"
}

class Example {
    var p: String by Delegate()
}

class Users{
    var name: String by Delegates.observable("No One"){
        property, oldValue, newValue -> println("$oldValue -> $newValue")
    }

    var id: Int by Delegates.vetoable(0){
        property, oldValue, newValue -> newValue>oldValue
    }

    var age: Int by Delegates.notNull()
}

fun main(){
    val e = Example()
    println(e.p)
    e.p = "Hello"
    println(e.p)

    println(lazyValue)
    println(lazyValue)

    val user = Users()
    user.name = "John Snow"
    println(user.id)
    user.id = 10
    println(user.id)
    user.id = 5
    println(user.id)
//    println(user.age)
    user.age = 23
    println(user.age)

    println(readOnly)
    println(readWrite)
    readWrite = "12"
    println(readWrite)

}



var topLevelInt: Int = 0
class ClassWithDelegate(val anotherClassInt: Int)

class Jjnjds(var memberInt: Int, val anotherClassInstance: ClassWithDelegate) {
    var delegatedToMember: Int by this::memberInt
    var delegatedToTopLevel: Int by ::topLevelInt

    val delegatedToAnotherClass: Int by anotherClassInstance::anotherClassInt
}
var Jjnjds.extDelegated: Int by ::topLevelInt

fun resourceDelegate(): ReadWriteProperty<Any?, String> =
    object : ReadWriteProperty<Any?, String> {
        var curValue = "0"
        override fun getValue(thisRef: Any?, property: KProperty<*>): String = curValue
        override fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
            curValue = value
        }
    }

val readOnly: String by resourceDelegate()  // ReadWriteProperty as val
var readWrite: String by resourceDelegate()
