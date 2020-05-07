import java.util.*


fun main(args: Array<String>) {
    val s = Scanner(System.`in`)
    val t = s.nextInt()

    val str = arrayOfNulls<String>(t)
    for (i in 0 until t) {
        str[i] = s.next()
    }
    
    val q = s.nextInt()
    val qtr = arrayOfNulls<String>(q)
    for (i in 0 until q) {
        qtr[i] = s.next()
    }
    var temp: String?
    for (i in 0 until t) {
        for (j in 1 until t) {
            if (str[j - 1]!! > str[j]!!) {
                temp = str[j - 1]
                str[j - 1] = str[j]
                str[j] = temp
            }
        }
    }
    var sum = 0
    for (i in 0 until q) {
        for (element in qtr[i]!!) {
            sum += element.toInt() - 64
        }
        for (k in 0 until t) {
            if (qtr[i] == str[k]) {
                sum *= k + 1
                break
            }
        }
        println(sum)
        sum = 0
    }
}
