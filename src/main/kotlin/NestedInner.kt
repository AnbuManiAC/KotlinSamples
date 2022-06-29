

class Outer{
    val a = 1
    inner class Inner{
        val b get() = a
    }
}