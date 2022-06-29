
class Myclass {

    var counter = 0

    companion object {
        lateinit var myclass: Myclass
        var name = "Wane"
        fun typeofCustomer() = println("Indian")

        fun instance(): Myclass{
            if(myclass==null) myclass = Myclass()
            return myclass
        }

    }

}

fun main(){
    println(Myclass.name)
    Myclass.name = "Rhode"
    println(Myclass.name)
    Myclass.typeofCustomer()
    Myclass.Companion.typeofCustomer()

}