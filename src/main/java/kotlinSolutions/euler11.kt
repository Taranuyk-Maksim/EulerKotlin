package kotlinSolutions

import java.util.*

private val arr = Array(20) { IntArray(20) }

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    for (grid_i in 0..19) {
        for (grid_j in 0..19) {
            arr[grid_i][grid_j] = input.nextInt()
        }
    }
   println(run())
}
private const val CONSECUTIVE = 4

private fun run(): Int {
    var max = -1
    for (y in arr.indices) {
        for (x in arr[y].indices) {
            max = Math.max(product(x, y, 1, 0, CONSECUTIVE), max)
            max = Math.max(product(x, y, 0, 1, CONSECUTIVE), max)
            max = Math.max(product(x, y, 1, 1, CONSECUTIVE), max)
            max = Math.max(product(x, y, 1, -1, CONSECUTIVE), max)
        }
    }
    return max
}


private fun product(x: Int, y: Int, dx: Int, dy: Int, n: Int): Int {
    // First endpoint is assumed to be in bounds. Check if second endpoint is in bounds.
    var x = x
    var y = y

    if (!isInBounds(x + (n - 1) * dx, y + (n - 1) * dy)) {
        return -1
    }
    var prod = 1
    var i = 0
    while (i < n) {
        prod *= arr[y][x]
        i++
        x += dx
        y += dy
    }
    return prod
}


private fun isInBounds(x: Int, y: Int): Boolean {
    return 0 <= y && y < arr.size && 0 <= x && x < arr[y].size
}