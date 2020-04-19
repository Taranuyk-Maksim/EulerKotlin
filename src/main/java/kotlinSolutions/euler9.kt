package kotlinSolutions

/**
 * check 2 cases
 * 3 cases time limit
 * 3 cases wrong
 */
fun main(args: Array<String>) {

    val inT = readLine()?.toInt()
    for (i in 1..inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}
private fun run(n: Int): Long {
    for (a in 1 until n) {
        for (b in a + 1 until n) {
            val c = n - a - b
            if (a * a + b * b == c * c) {
                return (a * b * c).toLong()
            }
        }
    }
    return -1
}