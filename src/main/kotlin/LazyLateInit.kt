class LazyLateInit {

    val nonNullable:Int = 20 //after compilation converted to java int
    val nullable:Int? = 10 //after compilation converted to java Integer


    //Under the hood Kotlin uses null as special case for finding whether the lateinit var is initialized or not

    lateinit var test: String
    init {
        test = ""
    }

    val test1 by lazy {
        1
    }

}
