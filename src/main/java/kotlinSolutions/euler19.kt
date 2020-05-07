package kotlinSolutions

/**
 * done
 */
import java.util.*

private const val SUNDAY = 0

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var t: Int = scan.nextInt()
    while (t-- > 0) {
        // input
        val dateArray = Array(2) { LongArray(3) }
        for (i in 0..1) {
            for (j in 0..2) {
                dateArray[i][j] = scan.nextLong()
            }
        }
        adjust(dateArray)
        var ak: Long = 0
        while (true) {
            if (dateArray[0][2] == 1L) {
                if (verify(dateArray[0][0], dateArray[0][1], dateArray[0][2])) {
                    ak++
                }
            }
            // set date
            dateArray[0][2] = 1
            // month plus 1
            dateArray[0][1]++
            if (dateArray[0][1] > 12) {
                dateArray[0][1] = 1
                dateArray[0][0]++
            }
            if (overDate(dateArray)) {
                break
            }
        }
        println(ak)
    }
    scan.close()
}

private fun overDate(dateArray: Array<LongArray>): Boolean {
    if (dateArray[0][0] > dateArray[1][0]) {
        return true
    } else if (dateArray[0][0] == dateArray[1][0]) {
        if (dateArray[0][1] > dateArray[1][1]) {
            return true
        } else if (dateArray[0][1] == dateArray[1][1]) {
            if (dateArray[0][2] > dateArray[1][2]) return true
        }
    }
    return false
}

private fun adjust(dateArray: Array<LongArray>) {
    if (overDate(dateArray)) {
        exchange(dateArray)
    }
}

private fun exchange(dateArray: Array<LongArray>) {
    var tmp = LongArray(3)
    tmp = dateArray[1]
    dateArray[1] = dateArray[0]
    dateArray[0] = tmp
}

private  fun verify(year1: Long, month1: Long, day: Long): Boolean {

    var year = year1
    var month = month1
    if (month < 3) {
        month += 12
        year -= 1
    }
    val c = year / 100
    val y = year % 100
    val w = ((y + y / 4 + c / 4 - 2 * c + 26 * (month + 1) / 10 + day - 1) % 7).toInt()

    return w == SUNDAY
}