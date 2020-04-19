package kotlinSolutions

/**
 * done
 * разобраться как работает факториал
 */
import java.math.BigInteger

fun main(args: Array<String>) {

    var t: Int = readLine()!!.toInt()
    while (t-- > 0) {
        val (n,m) = readLine()!!.split(' ')
        println(run(n.toLong(),m.toLong()))
    }
}

private fun run (n : Long, m : Long) : Int {
    val Required = factorial(BigInteger.valueOf(n.toLong() + m.toLong()))
            .divide(factorial(BigInteger.valueOf(n.toLong())))
            .divide(factorial(BigInteger.valueOf(m.toLong())))
            .mod(BigInteger.valueOf(1000000007))
    return Required.toInt()
}

fun factorial(n: BigInteger): BigInteger {
    return if (n === BigInteger.ZERO) BigInteger.ONE else n.multiply(factorial(n.subtract(BigInteger.ONE)))
}