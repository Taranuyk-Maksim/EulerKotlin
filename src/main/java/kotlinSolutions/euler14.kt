package kotlinSolutions

import kotlin.math.pow

/**
 * DONE
 */
private val arr = IntArray((5 * 10.0.pow(6.0) + 1).toInt())

fun main(args: Array<String>) {
    run()
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        val inN = readLine()!!.toInt()
        if (inN > 3732423) {
            println(3732423)
        } else {
            println(arr[inN])
        }
    }
}

private fun run() {
    var result = 0
    var maxcount = 0
    for (i in 2..3732423) {
        val count = steps(i.toLong(), 0)
        if (count > maxcount) {
            result = i
            maxcount = count
        } else if (count == maxcount) {
            result = i
        }
        arr[i] = result
    }
}
fun steps(n: Long, c: Int): Int {
    var num = n
    var count = c

    while (num != 1L) {
        num = if (num % 2 == 0L) {
            count++
            num / 2
        } else {
            count++
            num * 3 + 1
        }
    }
    return count
}
