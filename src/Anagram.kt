import java.util.*
import kotlin.math.abs

// Complete the anagram function below.
fun anagram(s: String): Int {
    if (s.length % 2 != 0) return -1
    var result = 0
    val s1 = s.slice(0 until s.length / 2)
    val s2 = s.slice(s.length / 2 until s.length)
    val h1 = IntArray(26)
    val h2 = IntArray(26)
    for (i in s1.indices) {
        h1[s1[i] - 'a']++
    }
    for (j in s1.indices) {
        h2[s2[j] - 'a']++
    }
    for (i in 0 until 26){
        result += abs(h1[i] - h2[i])
    }
    return result / 2
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = anagram(s)

        println(result)
    }
}