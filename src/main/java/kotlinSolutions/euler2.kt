/**
 * DONE
 */
fun main(args: Array<String>) {

    val inT = readLine()?.toInt();

    for (a0 in 0 until inT!!) {
        val inN = readLine()?.toLong()
        println(run(inN!!))
    }
}

private fun run(n: Long): Long {

    var first: Long = 0
    var next: Long = 1
    var sum: Long = 0

    while (n >= next) {

        if (next % 2 == 0L) {
            sum += next
        }

        next += first
        first = next - first
    }
    return sum
}


