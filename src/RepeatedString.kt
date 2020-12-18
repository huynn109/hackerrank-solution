import java.util.*

// Complete the repeatedString function below.
fun repeatedString(s: String, n: Long): Long {
    if (!s.contains('a')) return 0
    if (s.length <= 1) return n
    var countFirstChar = 0L
    var countLastChar = 0L
    val count = s.length.toLong()
    for (c in s.indices){
        if (s[c].toLowerCase() == 'a') {
            countFirstChar++
            if (c < (n % count).toInt()) countLastChar++
        }
    }
    return ((n / count ) * countFirstChar) + countLastChar
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val n = scan.nextLine().trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}