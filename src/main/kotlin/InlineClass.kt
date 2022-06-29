
@JvmInline
value class Zipcode(val zipcode: Int)

@JvmInline
value class Password(val password: String){
    init {
        require(password.length >=8)
    }

    val length get() = password.length
}

@JvmInline
value class Name(val name: String){
    fun greet() = println("Hello $name")
}

interface I

@JvmInline
value class Foo(val i:Int) : I
fun asInline(f: Foo){}
fun asInterface(i:I){}
fun asNullable(f:Foo?){}

//Mangling




fun main(){
    val password = Password("12123123")
    val zipcode = Zipcode(128483284)

    println("$zipcode and $password")
    Name("Magneto").greet()
    println(password.length)

    val f = Foo(23)
    asInline(f) // f is used as Foo wrapper as unboxed

    asInterface(f) // f is used as Interface I boxed

    asNullable(f) // f is used as Nullable foo

    val nameAlias: NameTypeAlias = ""
    val nameInlineClass: NameInlineClass = NameInlineClass("")
    val string: String = ""

    acceptString(nameAlias) // OK: pass alias instead of underlying type
//    acceptString(nameInlineClass) // Not OK: can't pass inline class instead of underlying type

    // And vice versa:
    acceptNameTypeAlias(string)
    acceptNameTypeAlias(string) // OK: pass underlying type instead of alias
//    acceptNameInlineClass(string) // Not OK: can't pass underlying type instead of inline class

}


typealias NameTypeAlias = String

@JvmInline
value class NameInlineClass(val s: String)

fun acceptString(s: String) {}
fun acceptNameTypeAlias(n: NameTypeAlias) {}
fun acceptNameInlineClass(p: NameInlineClass) {}


