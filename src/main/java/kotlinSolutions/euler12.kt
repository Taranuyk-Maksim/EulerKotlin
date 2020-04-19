import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.sqrt

/**
 * DONE
 * разобраться какработает
 */
private val arr = IntArray(1001)

fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    run()
    for (t in 0..inT) {
        val inN = readLine()!!.toInt()
        println(arr[inN])
    }
}

private fun run() {
    var temp = 0
    var box = 0
    for (i in 1..1000) {
        while (temp <= i) {
            box++
            temp = factor(box * (box + 1) / 2)
        }
        arr[i] = box * (box + 1) / 2
    }
}

private fun factor(a: Int): Int {
    var count = 0
    if (a == 1) {
        return 1
    }
    var i = 1
    while (i < ceil(sqrt(a.toDouble()))) {
        if (a % i == 0) {
            count += 2
        }
        i++
    }
    if (ceil(sqrt(a.toDouble())) == floor(sqrt(a.toDouble()))) {
        count++
    }
    return count
}



