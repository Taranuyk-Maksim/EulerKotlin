//package kotlinSolutions
//fun main(args: Array<String>) {
//    val inT = readLine()!!.toInt()
//    for (t in 0 until inT) {
//        val inN = readLine()!!.toInt()
//        println(run(inN))
//    }
//}
//private fun run(): String? {
//    // Initialize
//    val array = IntArray(10)
//    for (i in array.indices) array[i] = i
//
//    // Permute
//    for (i in 0..999998) {
//        if (nextPermutation(array)) throw AssertionError()
//    }
//
//    // Format output
//    var ans = ""
//    for (i in array.indices) ans += array[i]
//    return ans
//}
//
//fun nextPermutation(arr: IntArray): Boolean {
//    var i = arr.size - 1
//    while (i > 0 && arr[i - 1] >= arr[i]) {
//        i--
//    }
//    if (i <= 0) return false
//    run {
//        var j = arr.size - 1
//        while (arr[j] <= arr[i - 1]) {
//            j--
//        }
//        val temp = arr[i - 1]
//        arr[i - 1] = arr[j]
//        arr[j] = temp
//    }
//    var j = arr.size - 1
//    while (i < j) {
//        val temp = arr[i]
//        arr[i] = arr[j]
//        arr[j] = temp
//        i++
//        j--
//    }
//    return true
//}