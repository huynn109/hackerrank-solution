/*
 * Complete the 'larrysArray' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER_ARRAY A as parameter.
 */

fun larrysArray(arr: Array<Int>): String {
    var result = 0
    for (i in 1 until arr.size) {
        val key = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j -= 1
            result++
        }
        arr[j + 1] = key
    }
    return if (result % 2 == 0) "YES" else "NO"
}

fun main(args: Array<String>) {
    val t = readLine()!!.trim().toInt()

    for (tItr in 1..t) {
        val n = readLine()!!.trim().toInt()

        val A = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

        val result = larrysArray(A)

        println(result)
    }
}
