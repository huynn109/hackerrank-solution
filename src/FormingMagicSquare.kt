import java.util.*
import kotlin.math.abs

// Complete the formingMagicSquare function below.
fun formingMagicSquare(s: Array<Array<Int>>): Int {
    var min = Int.MAX_VALUE
    val magicSquareList = arrayOf(
        arrayOf(intArrayOf(4, 9, 2), intArrayOf(3, 5, 7), intArrayOf(8, 1, 6)),
        arrayOf(intArrayOf(4, 3, 8), intArrayOf(9, 5, 1), intArrayOf(2, 7, 6)),
        arrayOf(intArrayOf(2, 9, 4), intArrayOf(7, 5, 3), intArrayOf(6, 1, 8)),
        arrayOf(intArrayOf(2, 7, 6), intArrayOf(9, 5, 1), intArrayOf(4, 3, 8)),
        arrayOf(intArrayOf(8, 1, 6), intArrayOf(3, 5, 7), intArrayOf(4, 9, 2)),
        arrayOf(intArrayOf(8, 3, 4), intArrayOf(1, 5, 9), intArrayOf(6, 7, 2)),
        arrayOf(intArrayOf(6, 7, 2), intArrayOf(1, 5, 9), intArrayOf(8, 3, 4)),
        arrayOf(intArrayOf(6, 1, 8), intArrayOf(7, 5, 3), intArrayOf(2, 9, 4))
    )
    repeat(magicSquareList.count()) {
        var cost = 0
        for (i in 0 until 3) for (j in 0 until 3) cost += abs(magicSquareList[it][i][j] - s[i][j])
        if (cost < min) min = cost
    }
    return min
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = Array(3) { Array<Int>(3) { 0 } }

    for (i in 0 until 3) {
        s[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = formingMagicSquare(s)

    println(result)
}