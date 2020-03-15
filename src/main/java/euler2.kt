
fun main(args: Array<String>) {

    val inT = readLine()?.toInt();

    for (a0 in 0 until inT!!) {

        var first: Long = 0
        var next: Long = 1
        var sum: Long = 0

        val inN = readLine()?.toLong()

        while (inN!! >= next) {

            if (next % 2 == 0L) {
                sum += next
            }

            next += first
            first = next - first
        }
        println(sum)
    }
 }
