package kotlinSolutions

/**
 * done
 */
import java.math.BigInteger

fun main(args: Array<String>) {
    val inT = readLine()?.toInt()
    for (i in 1 .. inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}

private fun run(n : Int) : Int {
    val fact = factorial(n).toString()
    var sum = 0
    for(c in fact.toCharArray()){
        sum += c.toString().toInt()
    }
    return sum
}

private fun factorial(n : Int ) : BigInteger{
    var fact = BigInteger.ONE
    for (i in 1 .. n) {
        fact *= BigInteger(i.toString())
    }
    return fact
}