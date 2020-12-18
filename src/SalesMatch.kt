import java.util.*

// Complete the sockMerchant function below.
fun sockMerchant(n: Int, ar: Array<Int>): Int {
    val arTmp = mutableMapOf<Int, Int>()
    for (i in ar.indices) {
        arTmp[ar[i]] = (arTmp[ar[i]] ?: 0) + 1
    }
    var count = 0
    arTmp.forEach { (_, u) ->
        count += u / 2
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}