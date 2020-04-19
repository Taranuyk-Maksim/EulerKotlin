/**
 * DONE
 */
import kotlin.math.sqrt

    fun main(args: Array<String>) {
        val inT = readLine()?.toLong()
        for (t in 0 .. inT!!) {
            val inN = readLine()?.toLong()
            println(run(inN!!))
        }
    }

    private fun run(N: Long): Long {
        var n = N
        while (true) {
            val mf = minFactor(n)
            if (mf < n) {
                n /= mf
            } else {
                return n
            }
        }
    }

    //return min factorial
    private fun minFactor(n: Long): Long {
        for (i in 2..sqrt(n.toDouble()).toLong()) {
            if (n % i == 0L) {
                return i
            }
        }
        return n
    }
