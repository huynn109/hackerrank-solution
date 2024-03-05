fun main() {
    val result = twoNumberSum(mutableListOf(3, 5, -4, 8, 11, 1, -1, 6), 10)
    println(result)
}


fun twoNumberSum(array: MutableList<Int>, targetSum: Int): List<Int> {
    val resultMap = mutableMapOf<Int, Int>()
    for (i in array.indices) {
        val potentialMatch = targetSum - array[i]
        if (resultMap.containsKey(potentialMatch)) {
            return listOf(potentialMatch, array[i])
        } else {
            resultMap[array[i]] = i
        }
    }
    return listOf<Int>()
}
