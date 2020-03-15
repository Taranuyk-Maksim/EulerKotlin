val inT  = readLine()?.toInt()

fun main(args: Array<String>) {

    for (t in 1..inT!!){

        val inN  = readLine()?.toInt()

        val sum3  = sumCalc(3,inN!!)
        val sum5 = sumCalc(5,inN)
        val sum15 = sumCalc(15,inN)

        val sum = if (inN > 15){

            sum5 + sum3 - sum15
        }else {
            sum5 + sum3
        }

        println(sum)

        println("sum 3 $sum3")
        println("sum 5 $sum5")
        println("sum 15 $sum15")


    }
}

fun sumCalc (a1 : Int, n : Int) : Int {

    //step
    val d = a1

    //amount of elements
    val N = (n-1)/a1

    //last element
    val aN = a1 + (N - 1) * d

    //sum of elements
    val sN  = ((
            (a1 + aN).toDouble() / 2) * N)

    return sN.toInt()
}