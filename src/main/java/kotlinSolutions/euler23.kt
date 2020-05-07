/**
 * done
 */

var limit = 28123
var abundant_numbers = BooleanArray(limit)

private fun foo(N: Int): Int {
    var sum = 0
    var i = 2
    while (i * i < N) {
        if (N % i == 0) sum += i + N / i
        i++
    }
    if (sum == 0) return sum

    sum++
    return sum
}

fun main(args: Array<String>) {
    init()
    var t = readLine()!!.toInt()
    while (t-- > 0) {
        val a0 = readLine()!!.toInt()
        if (a0 > limit) {
            println("YES")
        } else {
            if (getResult(a0)) {
                println("YES")
            } else {
                println("NO")
            }
        }
    }
}

private fun getResult(a0: Int): Boolean {
    val i = (a0 + 1) / 2
    for (k in 1..i) {
        if (abundant_numbers[k] && abundant_numbers[a0 - k]) {
            return true
        }
    }
    return false
}

fun init(){
    for (i in 1..limit) {
        if (i > 6 && i % 6 == 0) {
            abundant_numbers[i] = true
        } else {
            val sum = foo(i)
            if (i < sum) {
                abundant_numbers[i] = true
            }
        }
    }
}

