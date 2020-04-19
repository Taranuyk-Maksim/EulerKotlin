/**
 * done but time limit wrong
 */
import java.math.BigInteger

fun main(args: Array<String>) {

    val inT = readLine()?.toInt()
    for (i in 1..inT!!) {
        val inN = readLine()?.toInt()
        println(run(inN!!))
    }
}

private fun run(n : Int ) : Int {
    var i = 1
    var count = 0
    while (true){
        i ++
        if(i % 2 == 0 && i!= 2
                || i % 3 == 0 && i != 3
                || i % 5 == 0 && i != 5
                || i % 7 == 0 && i != 7){
            continue
        }
        if(isPrime(i)){
            count ++
            if (count == n) {
                return i
            }
        }
    }
}

private fun isPrime (x : Int) : Boolean {
    var bg : BigInteger = BigInteger.valueOf(x.toLong())
    return bg.isProbablePrime(x)
}
