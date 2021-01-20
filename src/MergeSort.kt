import java.util.*

// Complete the countSwaps function below.
// Merges two subarrays of arr[].
// First subarray is arr[l..m]
// Second subarray is arr[m+1..r]
fun merge(arr: IntArray, l: Int, m: Int, r: Int) {
    // Find sizes of two subarrays to be merged
    val n1 = m - l + 1
    val n2 = r - m

    /* Create temp arrays */
    val arrL = IntArray(n1)
    val arrR = IntArray(n2)

    /*Copy data to temp arrays*/
    for (i in 0 until n1) arrL[i] = arr[l + i]
    for (j in 0 until n2) arrR[j] = arr[m + 1 + j]

    /* Merge the temp arrays */

    // Initial indexes of first and second subarrays
    var i = 0
    var j = 0

    // Initial index of merged subarry array
    var k = l
    while (i < n1 && j < n2) {
        if (arrL[i] <= arrR[j]) {
            arr[k] = arrL[i]
            i++
        } else {
            arr[k] = arrR[j]
            j++
        }
        k++
    }

    /* Copy remaining elements of L[] if any */
    while (i < n1) {
        arr[k] = arrL[i]
        i++
        k++
    }

    /* Copy remaining elements of R[] if any */
    while (j < n2) {
        arr[k] = arrR[j]
        j++
        k++
    }
}

// Main function that sorts arr[l..r] using
// merge()
fun sort(arr: IntArray, l: Int, r: Int) {
    if (l < r) {
        // Find the middle point
        val m = (l + r) / 2

        // Sort first and second halves
        sort(arr, l, m)
        sort(arr, m + 1, r)

        // Merge the sorted halves
        merge(arr, l, m, r)
    }
}

fun printArray(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) print(arr[i].toString() + " ")
    println()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    System.setProperty("java.util.Arrays.useLegacyMergeSort", "true")
    sort(a.toIntArray(), 0, a.size - 1)

    printArray(a.toIntArray())
}