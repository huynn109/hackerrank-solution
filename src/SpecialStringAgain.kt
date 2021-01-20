import java.util.*


// Complete the substrCount function below.
fun substrCount(n: Int, s: String): Long {
    var numOfSpecialStrings: Int = s.length
    var i = 0
    while (i < s.length) {
        var numOfRepeat = 0
        while (i + 1 < s.length && s[i] == s[i + 1]) {
            numOfRepeat++
            i++
        }
        numOfSpecialStrings += numOfRepeat * (numOfRepeat + 1) / 2
        var pointer = 1
        while (i - pointer >= 0 && i + pointer < s.length && s[i + pointer] == s[
                    i - 1] && s[i - pointer] == s[i - 1]
        ) {
            numOfSpecialStrings++
            pointer++
        }
        i++
    }
    return numOfSpecialStrings.toLong()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val s = scan.nextLine()

    val result = substrCount(n, s)

    println(result)
}