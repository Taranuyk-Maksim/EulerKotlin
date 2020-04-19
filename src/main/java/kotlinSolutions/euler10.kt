import java.math.BigInteger

/**
 * DONE but 4 test cases wrong time!!!!
 */
fun main(args: Array<String>) {
    val inT = readLine()?.toInt()
    for (i in 1..inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}

private fun run(n : Int ) : Int {
    var i = 0
    var sum = 0
    while (true){
        i ++
        if(isPrime(i)){
            println(i)
            if (i <= n) {
                sum += i
            } else {
                return sum
            }
        }
    }
}

private fun isPrime (x : Int) : Boolean {
    var bg : BigInteger = BigInteger.valueOf(x.toLong())
    return bg.isProbablePrime(x)
}