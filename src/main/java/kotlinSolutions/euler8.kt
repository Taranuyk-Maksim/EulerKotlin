/**
 * DONE
 */
fun main(args: Array<String>) {

    val t: Int = readLine()!!.toInt()
    for (a0 in 0 until t) {
        val (n,k) = readLine()!!.split(' ')
        //val k = readLine()?.toInt()
        val num = readLine()

        println(run(n.toInt(),k.toInt(),num!!))
    }
}
 private fun run(n: Int, k: Int, num: String): Int {
    var product = 1
    var max = 0
     var j: Int
     var i: Int = 0
    while (i < n - k) {
        j = 0
        while (j < k) {
            val ch = num[i + j]
            val m = ch.toString().toInt()
            product *= m
            j++
        }
        if (product >= max) max = product
        product = 1
        i++
    }
    return max
}