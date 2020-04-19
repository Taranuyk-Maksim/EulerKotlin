/**
 * DONE
 */
fun main(args: Array<String>) {

    val inT = readLine()?.toInt()
    for (i in 1..inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}

private fun run (n : Int) : Long{
    var sum = 0L
    var mul = 0L
    for (i in  1..n) {
        mul += i
        sum += i * i
    }
    return (mul * mul) - sum
}
