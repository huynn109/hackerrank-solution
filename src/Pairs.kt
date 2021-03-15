import java.util.*

// Complete the pairs function below.
fun pairs(k: Int, arr: Array<Int>): Int {
    var count = 0
    for (i in arr.indices) {
        for (j in i + 1 until arr.size) {
            var t = arr[i] - arr[j]
            if (t == k || k + t == 0) {
                count++
            }
        }
    }
    return count
}

fun pairs2(k: Int, arr: Array<Int>): Int {
    val hashMap = mutableMapOf<Int, Int>()
    var count = 0
    for (i in arr.indices) {
        if (hashMap.containsKey(arr[i] + k)) count++
        if (hashMap.containsKey(arr[i] - k)) count++
        hashMap[arr[i]] = arr[i]
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = pairs2(k, arr)

    println(result)
}
