
/**
 * DO NOT WORK
 */

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val inT = readLine()!!.toInt()

    for (a0 in 0 until inT) {
        val inN = readLine()!!.toInt()
        val arr = arrayListOf<ArrayList<Int>>()
        for (i in 0 ..  inN) {
            arr.add(arrayListOf(scan.nextInt()))
        }
        run(arr)
    }
}
private fun run(triangle : ArrayList<ArrayList<Int>>) {

    for (y in 13 downTo 0) {
        for (i in 0..y) {
            triangle[y][i] += if (triangle[y + 1][i] > triangle[y + 1][i + 1]) triangle[y + 1][i]
            else triangle[y + 1][i + 1]
            println(y.toString() + ", " + i + " : " + triangle[y].get(i))
        }
    }

}