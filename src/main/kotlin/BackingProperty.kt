class Employee {
    private var _age = 0
    var age: Int
        get() {
            println("In get")
            return _age
        }
        set(value) {
            println("In set")
            _age = value
        }


    var id: Int = 10
        private set


    fun printAge() {
        println("EMP age is $age")
    }
}

class Student {
    private val _hobbies = mutableListOf<String>()
    val hobbies: List<String>
        get() = _hobbies

    fun addHobby(hobby: String) {
        _hobbies.add(hobby)
    }
}

fun max() = 8

fun main() {
    val emp = Employee()
    emp.age = 30

    println("Age is : ${emp.age}")
    emp.printAge()


    val student = Student()
    student.addHobby("Cricket")

    println(student.hobbies)


}