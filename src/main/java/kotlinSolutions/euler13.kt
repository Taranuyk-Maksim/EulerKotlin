import java.math.BigInteger

/**
 * DONE
 */
private val arr = ArrayList<String>()

fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        arr.add(readLine()!!)
    }
    println(run())
}

private fun run(): String? {
    var sum = BigInteger.ZERO
    for (num in arr) {
        sum = sum.add(BigInteger(num))
    }
    return sum.toString().substring(0, 10)
}