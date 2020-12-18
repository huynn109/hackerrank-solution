import java.util.*
import java.util.Collections.swap

// Complete the countSwaps function below.
fun countSwaps(a: Array<Int>): Unit {
    var swapCount = 0
    for (i in a.indices) {
        for (j in 0 until a.size - 1) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                swapCount++
                val tmp = a[j]
                a[j] = a[j + 1]
                a[j + 1] = tmp
            }
        }
    }
    println("Array is sorted in $swapCount swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size - 1]}")
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countSwaps(a)
}