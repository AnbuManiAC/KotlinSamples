

data class User(val name:String, val id:Int, val dept: String = "CSE"){

}

fun main(){
    val user1 = User("Sam",10)
    val user2 = User("Sam",10)

    if(user1 == user2) println("Equal")
    else println("Unequal")

    println(user1)
    val user3 = user1.copy(id = 11)
    println(user3)
    val (name,id,dept) = user3
    println("$name $id $dept")

}
