import java.util.*

// Complete the miniMaxSum function below.
fun miniMaxSum(arr: Array<Int>): Unit {
    var tmpSum: Long = 0
    for (i in arr.indices) {
        for (j in (i + 1) until arr.size) {
            if (arr[j] < arr[i]) {
                val tmp = arr[j]
                arr[j] = arr[i]
                arr[i] = tmp
            }
        }
    }
    arr.forEachIndexed { index, i ->
        tmpSum += arr[index]
    }
    print("${tmpSum - arr[arr.size - 1]} ${tmpSum - arr[0]}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    miniMaxSum(arr)
}