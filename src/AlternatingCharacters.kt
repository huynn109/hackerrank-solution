import java.util.*

// Complete the alternatingCharacters function below.
fun alternatingCharacters(s: String): Int {
    return 0
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