import kotlin.collections.*

// Complete the countTriplets function below.
fun countTriplets(arr: Array<Long>, r: Long): Long {
    val mapTmp = mutableMapOf<Long, Int>()
    for (i in arr.indices) {
        if (mapTmp.contains(arr[i])) mapTmp[arr[i]] = (mapTmp[arr[i]] ?: 0) + 1
        else mapTmp[arr[i]] = 1
    }
    var result = 0
    for (i in 0 until mapTmp.keys.size) {
        var mul = 0
        if (arr[i] >= r) {
            val tmpMin = arr[i] / r
            val tmpMax = arr[i] * r
            val min = mapTmp[tmpMin] ?: 1
            val max = mapTmp[tmpMax] ?: 1
            val current = mapTmp[arr[i]] ?: 1
            mul = min * current * max
        }
        result += mul
    }
    return result.toLong()
}

fun countTriplets1(arr: Array<Long>, r: Long): Long {
    val mapRight = mutableMapOf<Long?, Long>()
    val mapLeft = mutableMapOf<Long?, Long>()
    var result = 0L
    for (i in arr.indices) {
        if (mapRight.contains(arr[i])) mapRight[arr[i]] = (mapRight[arr[i]] ?: 0) + 1
        else mapRight[arr[i]] = 1
    }
    for (i in arr.indices) {
        var c1: Long = 0
        var c3: Long = 0
        val mid = arr[i]
        mapRight[mid] = (mapRight[mid] ?: 0) - 1
        if (mapLeft.containsKey(mid / r) && ((mid % r) == 0L))
            c1 = mapLeft[mid / r]!!
        if (mapRight.containsKey(mid * r))
            c3 = mapRight[mid * r]!!
        result += c1 * c3
        mapLeft[mid] = (mapLeft[mid] ?: 0) + 1
    }
    return result
}

fun main(args: Array<String>) {
    val nr = readLine()!!.trimEnd().split(" ")

    val n = nr[0].toInt()

    val r = nr[1].toLong()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val ans = countTriplets1(arr, r)

    println(ans)
}
