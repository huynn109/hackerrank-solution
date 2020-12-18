import java.util.*

/*
@see <a href="https://www.hackerrank.com/challenges/2d-array">
 */
// Complete the hourglassSum function below.
fun hourglassSum(arr: Array<Array<Int>>): Int {
    var max = 0
    var first = true
    for (i in 1 until arr.size - 1) {
        for (j in 1 until arr[i].size - 1) {
            if (first){
                first = false
                max = arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1]
            }
            if (arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1] > max)
                max =
                    arr[i - 1][j - 1] + arr[i - 1][j] + arr[i - 1][j + 1] + arr[i][j] + arr[i + 1][j - 1] + arr[i + 1][j] + arr[i + 1][j + 1]
        }
    }
    return max
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

    for (i in 0 until 6) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = hourglassSum(arr)

    println(result)
}