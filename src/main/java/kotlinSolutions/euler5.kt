import java.math.BigInteger

/**
 * DONE
 */
fun main(args: Array<String>) {

    val inT = readLine()?.toInt()
    for (i in 1 .. inT!!) {
        val inN = readLine()?.toInt()
        run(inN!!)

    }
}

private fun run (n : Int) : BigInteger {
    var allLcm : BigInteger = BigInteger.ONE
    for (i in 1 .. n) {
        allLcm = lcm(BigInteger.valueOf(i.toLong()), allLcm)
    }
    return allLcm
}

 private fun lcm (x : BigInteger, y : BigInteger) : BigInteger {
     return x.divide(x.gcd(y)).multiply(y)
 }