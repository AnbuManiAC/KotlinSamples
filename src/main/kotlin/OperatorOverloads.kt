import java.awt.Stroke

data class Point(val x:Int, val y:Int)

operator fun Point.unaryPlus() = this.x-9
operator fun Int.inc() = this-3

operator fun <T> T.unaryPlus() = this.toString().lowercase()

operator fun String.unaryPlus() = this.uppercase()

operator fun Point.plus(other: Point) = Point(x+other.x, y+other.y)


fun main(){

    var a : Int = 10

    println(+Point(10,11))
    println(a++)
    println(+20)
    println(-(-(-20)))
    println(+"wDKj")


    println(Point(0, 1)+(Point(1, 2)))
}