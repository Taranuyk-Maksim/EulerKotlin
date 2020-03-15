
fun main(args: Array<String>) {

    var inT  = readLine()?.toInt()

    for (t in 1 until inT!!){

        var inN  = readLine()?.toInt()
        var i = 2
        while (inN!! > 1){
            if(inN % i == 0){
                inN /=  i
            }else{
                i += 1
            }
            println(9/5)
        }

    }



}