fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}
class Ted{

    infix fun Int.ted(t:Int) = println("$t")
}
//
//fun <T> returnAsList(t:Int): List<T>{
//    val result = ArrayList<T>()
//    if(t==1){
//        result.add(1 as T)
//        result.add(1 as T)
//        result.add(1 as T)
//        result.add(1 as T)
//        result.add(1 as T)
//    }
//    if(t==2){
//        result.add("a" as T)
//        result.add("a" as T)
//        result.add("a" as T)
//        result.add("a" as T)
//        result.add("a" as T)
//    }
//
//    return result
//}


fun returnAsList(t:Int): List<Any>{
    val result = ArrayList<Any>()
    if(t==1){
        result.add(1)
        result.add(1)
        result.add(1)
        result.add(1)
        result.add(1)
    }
    if(t==2){
        result.add("a")
        result.add("a")
        result.add("a")
        result.add("a")
        result.add("a")
    }

    return result
}

fun main()
{
    val test = mutableListOf(1,"2",3,"Anbu",0.2)
    println(test)

    val array = returnAsList(1)
val array1 = returnAsList(2)
    println(array)
    println(array1)
}
