

sealed class Shapes

class Circle(var radius: Float) : Shapes()

class Sqr(var side: Int) : Shapes()

class Rect(var length: Int, var breadth: Int) : Shapes()


fun main(){
    var circle = Circle(5.5f)
    var square = Sqr(10)
    var rectangle = Rect(6,4)

    checkShape(circle)
}

fun checkShape(shape: Shapes){

    when(shape){
        is Circle-> println("Its Circle")
        is Sqr-> println("Its Square")
        is Rect-> println("Its Rectangle")
    }
}