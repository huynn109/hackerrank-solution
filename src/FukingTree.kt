fun main() {
    val trees = intArrayOf(4, 42, 40, 26, 46)
//    val trees1 = intArrayOf(20, 15, 10, 17)
    val output = findHeight(trees, 20)
//    val output1 = findHeight(trees1, 7)
    println(output)
//    println(output1)
}

fun findHeight(trees: IntArray, m: Int): Int {
    var low = 0
    var high = trees.maxOrNull() ?: 0

    while (low <= high) {
        val mid = low + (high - low) / 2
        val total = trees.sumOf { if (it > mid) it - mid else 0 }

        if (total == m) {
            return mid
        } else if (total < m) {
            high = mid - 1
        } else {
            low = mid + 1
        }
    }

    return high
}
