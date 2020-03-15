fun main(args: Array<String>) {
    var sum = 0
    var inT  = readLine()?.toInt()
    for (i in 1 until inT!!){

        if((i %3 == 0) or (i % 5 == 0))
            sum +=i


    }
    println(sum)
}