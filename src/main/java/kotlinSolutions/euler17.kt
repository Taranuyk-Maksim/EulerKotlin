/**
 * done but two last tests not work
 */
fun main(args: Array<String>) {
    val inT = readLine()!!.toInt()
    for (t in 0 until inT) {
        val inN = readLine()!!.toLong()
        println(toEnglish(inN))
    }
}

private fun toEnglish(n: Long): String? {
    return when {
        n in 0..19 -> ONES[n.toInt()]
        n in 20..99 -> TENS[n.toInt() / 10] +
                if (n % 10 != 0L) ONES[n.toInt() % 10]
                else ""
        n in 100..999 -> ONES[n.toInt() / 100] + "Hundred " +
                if (n % 100 != 0L) "" + toEnglish(n % 100)
                else ""
        n in 1000..999999 -> toEnglish(n / 1000) + "Thousand " +
                if (n % 1000 != 0L) toEnglish(n % 1000)
                else ""
        n in 1000000..999999999 -> toEnglish(n / 1000000) + "Million  " +
                if (n % 1000000 != 0L) toEnglish(n % 1000000)
                else ""
        1000000000 <= n -> toEnglish(n / 1000000000) + "Billion  " + (
                if (n % 1000000000 != 0L) toEnglish(n % 1000000000)
                else "")
        else -> throw IllegalArgumentException()
    }
}

private val ONES = arrayListOf(
    "Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ",
    "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen ")

private val TENS = arrayListOf(
    "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety ")
