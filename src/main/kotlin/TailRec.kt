import java.math.BigInteger


tailrec fun getFibonacciNumber(n: Int, a: BigInteger, b: BigInteger) : BigInteger{
    if(n == 0)
        return b
    else
        return getFibonacciNumber(n-1,a+b,a)
}

fun main(){
    println(getFibonacciNumber(100000, BigInteger("1"),BigInteger("0")))
}
