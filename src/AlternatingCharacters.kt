import java.util.*

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    var count = 0
    for (i in 0 until s.lastIndex){
        if (s[i] == s[i + 1])
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}