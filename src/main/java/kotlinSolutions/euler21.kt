package kotlinSolutions

/**
 * Done
 * test cases 2,3 time limit
 */
fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        val inN = readLine()!!.toInt()
        println(run(inN))
    }
}

private fun run(n : Int): Int? {
    var sum = 0
    for (i in 1 until n) {
        if (isAmicable(i)) sum += i
    }
    return sum
}


private fun isAmicable(n: Int): Boolean {
    val m = divisorSum(n)
    return m != n && divisorSum(m) == n
}


private  fun divisorSum(n: Int): Int {
    var sum = 0
    for (i in 1 until n) {
        if (n % i == 0) sum += i
    }
    return sum
}