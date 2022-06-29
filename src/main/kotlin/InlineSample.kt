

inline fun execute(action: ()-> Unit){
    action()
}

inline fun executeAll(action1: () -> Unit, noinline action2: () -> Unit) {
    action1()
    action2()
}

inline fun foo(crossinline f: () -> Unit) {
    bar { f() }
}

fun bar(f: () -> Unit) {
    f()
}

fun main(){
    execute {
        println("Hello")
        println("World")
    }


    executeAll({ println("Hello") }, { println("World") })

    foo { println("Hello world") }

}
