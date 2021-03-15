import java.util.*
import kotlin.math.max

// Complete the maxSubsetSum function below.
fun maxSubsetSum(arr: Array<Int>): Int {
    if (arr.isEmpty()) { // Edge case
        return 0
    }
    val n: Int = arr.size
    if (n == 1) { // Edge case
        return arr[0]
    }
    var max = max(arr[0], arr[1])
    arr[1] = max
    for (i in 2 until arr.size) {
        max = max(arr[i - 2] + arr[i], max)
        max = max(arr[i], max);
        arr[i] = max
    }
    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = maxSubsetSum(arr)

    println(res)
}
