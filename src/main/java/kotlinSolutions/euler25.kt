package kotlinSolutions

import java.math.BigInteger

/**
 * done 3 test cases
 * 1 test cases wrong time limit
 */
fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 1..inT!!) {
        val inN : Int? = readLine()?.toInt()

        println(run(inN!!))
    }
}

private fun run(n : Int): String? {
    val lowerThres = BigInteger.TEN.pow(n - 1)
    var prev = BigInteger.ONE
    var cur = BigInteger.ZERO
    var i = 0
    while (true) {
        if (cur >= lowerThres)
            return i.toString()

        val temp = cur.add(prev)

        prev = cur
        cur = temp
        i++
    }
}
//private fun run(n : Int) : Int {
//
//    var first: Long = 0
//    var next: Long = 1
//    var count = 1
//    while (true) {
//        count++
//        next += first
//        first = next - first
//        if(next.toString().length == n){
//            return count
//        }
//    }
//}
