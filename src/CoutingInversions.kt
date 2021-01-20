import java.util.*
import kotlin.math.abs

// Complete the countInversions function below.
var counting = 0L
fun merge(arr: Array<Int>, l: Int, m: Int, r: Int) {
    val n1 = m - l + 1
    val n2 = r - m
    val arrL = Array(n1) { 0 }
    val arrR = Array(n2) { 0 }
    System.arraycopy(arr, l, arrL, 0, n1)
    System.arraycopy(arr, m + 1, arrR, 0, n2)
    var i = 0
    var j = 0
    var k = l
    while (i < n1 && j < n2) {
        if (arrL[i] <= arrR[j]) {
            arr[k] = arrL[i]
            i++
        } else {
            counting += arrL.size - i
            arr[k] = arrR[j]
            j++
        }
        k++
    }
    while (i < n1) {
        arr[k] = arrL[i]
        i++
        k++
    }
    while (j < n2) {
        arr[k] = arrR[j]
        j++
        k++
    }
}

fun mergeSort(arr: Array<Int>, l: Int, r: Int) {
    if (l < r) {
        val m = (r + l) / 2
        mergeSort(arr, l, m)
        mergeSort(arr, m + 1, r)

        merge(arr, l, m, r)
    }
}

fun countInversions(arr: Array<Int>): Long {
    mergeSort(arr, 0, arr.size - 1)
    return counting
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        val result = countInversions(arr)

        println(result)

        counting = 0
    }
}