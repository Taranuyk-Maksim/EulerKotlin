/**
 * DONE
 */
val inT = readLine()?.toInt()

fun main(args: Array<String>) {

    for (t in 1..inT!!) {
        val inN : Long? = readLine()?.toLong()

        println(run(inN!!))
    }
}

private fun run(n: Long): Long {

    var n1: Long = (n - 1) / 3
        n1 = 3 * n1 * (n1 + 1) / 2

    var n2: Long = (n - 1) / 5
        n2 = 5 * n2 * (n2 + 1) / 2

    var n3: Long = (n - 1) / 15
        n3 = 15 * n3 * (n3 + 1) / 2

    return n1 + n2 - n3
}
