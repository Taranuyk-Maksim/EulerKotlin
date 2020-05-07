package kotlinSolutions

/**
 * don`t work :-<
 */
fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        val inN = readLine()!!.toInt()
        println(run(inN))
    }
}
private fun run(inN : Int): Int? {
    var bestNumber = 0
    var bestLength = 0
    for (i in 1 until inN) {
        val len = getCycleLength(i)
        if (len > bestLength) {
            bestNumber = i
            bestLength = len
        }
    }
    return bestNumber
}


private fun getCycleLength(n: Int): Int {
    val stateToIter: MutableMap<Int, Int> = HashMap()
    var state = 1
    var iter = 0
    while (true) {
        if (stateToIter.containsKey(state)) return iter - stateToIter[state]!! else {
            stateToIter[state] = iter
            state = state * 10 % n
        }
        iter++
    }
}