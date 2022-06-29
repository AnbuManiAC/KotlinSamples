open class Shape
class Square : Shape() {
    fun getName() = "This is Square"
    fun getName(color: String) = "$color Square"

    companion object {}
}

fun Shape.getName() = "Shape"
fun Square.getName() = "Square"
fun Square.getName(color : String) = "This is $color square"

fun Square?.toString(): String {
    if (this == null) return "null"
    return toString()
}

val Square.color: String
    get() = "Blue"

fun Square.Companion.printCompanion() { println("companion") }

class CustomizedSquare(val square: Square, val color: String){

    fun printColor() { println(color) }

    fun Square.printDetails(){
        println(getName())
        println("of color ")
        printColor()
    }

    fun getInfo(){
        square.printDetails()
    }

}

infix fun Int.greaterValue(other: Int) = if(this>other) this else other
//Infix and extension

fun main() {

    fun printClassName(shape: Shape) {
        println(shape.getName())
    }

    printClassName(Square())
    println(Square().getName())
    println(Square().getName("Black"))
    println(null.toString())
    println(Square().toString())
    println(Square().color)
    Square.printCompanion()

    CustomizedSquare(Square(), "Red").getInfo()

    println(2 greaterValue 1)


//    var student = Student();
//    student.addHobby("Watching series")
//
//    println(student.hobbies)
//    println("Scholarship status : ${student.isScholar(80)}")
//
//    var str1 = "Hello "
//    var str2 = "world "
//    var str3 = "Hey "
//
//    println(str3.add(str1,str2))

}

//fun Student.isScholar(mark: Int) :Boolean = mark>95
//
//fun String.add(s1: String, s2: String) : String = this+s1+s2