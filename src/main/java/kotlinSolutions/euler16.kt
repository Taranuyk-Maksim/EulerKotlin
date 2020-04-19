package kotlinSolutions

/**
 * done
 */
import java.math.BigInteger

fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        val inN = readLine()!!.toInt()
        println(run(inN))
    }
}

private fun run (n : Int) : Int {
    val bi = BigInteger("2")
    val num = bi.pow(n)
    var sum  = 0

    for (i in num.toString().toCharArray()) {
       sum += i.toString().toInt()
    }
    return sum
}