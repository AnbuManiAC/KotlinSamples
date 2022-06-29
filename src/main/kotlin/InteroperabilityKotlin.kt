@file:JvmName("Sample")

fun main() {
    println("Max of 3 and 5 is ${InterOperabilityJava.getMax(3, 5)}")
}

fun add(a: Int, b: Int): Int = a + b

@JvmOverloads
fun findArea(l: Int, b: Int = 10): Int = l * b

