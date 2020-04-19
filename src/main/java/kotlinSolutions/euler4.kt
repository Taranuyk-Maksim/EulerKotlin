/**
 DONE
 проверка на полиндром
 */
fun main(args: Array<String>) {

    val inT = readLine()?.toInt()
    for (i in 1 .. inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}

private fun run (n : Int) : Int{
    var maxPalin = 0
    var prod : Int

    for (i in 100..999) {
        for (j in 100..999) {
            prod = i * j
            var num = prod
            var reversenum = 0
            while (num != 0) {
                reversenum *= 10
                reversenum += num % 10
                num /= 10
            }
            if (prod == reversenum && prod < n)
                if (prod > maxPalin)
                    maxPalin = prod
        }
    }
    return maxPalin
}

fun isPalindrome(pal: Int) : Boolean {
    return pal.toString() == pal.toString().reversed()
}
