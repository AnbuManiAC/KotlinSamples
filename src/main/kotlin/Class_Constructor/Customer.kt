package Class_Constructor

class Customer(_name : String) {

    var hasName = _name.isNotBlank()

    val hasmmm = _name
    lateinit var test : String



    var name: String = "Dummy"

    init {
        test = _name
        this.name = _name
        println("Customer name : $name")
    }
    fun printName(){
        println(name)
    }
}

class Student private constructor(var name : String){

    var id = -1

    init {
        println("Student name : $name and id is $id")
    }

    constructor(name : String, id :Int): this(name){
        this.id = id
    }

}

fun main(args : Array<String>){

    var customer = Customer("Professor")
    customer.name = "Eric"
    customer.printName()

    val student = Student("Magneto",20)
    println(student.id)

}

