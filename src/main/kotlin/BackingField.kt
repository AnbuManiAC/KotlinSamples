import VisibilityModifiers.Hello

class Human {
    var age = 2
        get()
        {
            println("Age in getter is $field")
            field = 5
            return field
        }
        set(value)
        {
            println("Age in setter is $field")
            if(value>0) field = value
            println("Age in setter is now $field")
        }
}

private class HelloChild : Hello() {

}

fun main() {
    val human = Human()
    human.age = 0
    println(human.age)
    human.age
    human.age = 10

}
