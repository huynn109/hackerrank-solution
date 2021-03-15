import java.util.*
import kotlin.collections.HashMap

// Complete the icecreamParlor function below.
fun icecreamParlor(m: Int, arr: Array<Int>): Array<Int> {
    val hashTmp = mutableMapOf<Int, Int>()
    for (i in 1..arr.size) {
        val remain = m - arr[i - 1]
        if (hashTmp.contains(arr[i - 1]))
            return arrayOf(hashTmp[arr[i - 1]] ?: 0, i)
        hashTmp[remain] = i
    }
    return arrayOf(0, 0)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val m = scan.nextLine().trim().toInt()

        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = icecreamParlor(m, arr)

        println(result.joinToString(" "))
    }
}
