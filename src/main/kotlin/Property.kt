
class Property(val a:Int?){
    val b get() = 2
    var c: String = ""
        get() = field.uppercase()
        set(value) {
            field = value
        }

}

fun main(){
    val property = Property(1)
    println(property.a)
    println(property.b)
    property.c = "Hello world"
    println(property.c)
}