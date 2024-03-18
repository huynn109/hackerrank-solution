fun main() {
//    println("isValidSubsequence ${isValidSubsequence(listOf(5, 1, 22, 25, 6, -1, 8, 10), listOf(1, 6, -1, 10))}")
//    println("isValidSubsequence ${isValidSubsequence(listOf(1, 1, 6, 1), listOf(1, 1, 1, 6))}")
    println(
        "isValidSubsequence ${
            isValidSubsequence(
                listOf(5, 1, 22, 25, 6, -1, 8, 10),
                listOf(5, 1, 22, 23, 6, -1, 8, 10)
            )
        }"
    )
}

fun isValidSubsequence(array: List<Int>, sequence: List<Int>): Boolean {
    val sequenceQueue = sequence.toMutableList()
    repeat(array.size) { value ->
        if (array[value] == sequenceQueue.firstOrNull()) sequenceQueue.removeFirst()
        if (sequenceQueue.isEmpty()) return true
    }
    return sequenceQueue.isEmpty()
}