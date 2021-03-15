import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// Complete the countTriplets function below.
fun countTriplets(arr: Array<Long>, r: Long): Long {
    val mapTmp = mutableMapOf<Long, Int>()
    for (i in arr.indices) {
        if (mapTmp.contains(arr[i])) mapTmp[arr[i]] = (mapTmp[arr[i]] ?: 0) + 1
        else mapTmp[arr[i]] = 1
    }
    var result = 0
    for (i in 0 until mapTmp.keys.size - 1) {
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
    return 0L
}

fun main(args: Array<String>) {
    val nr = readLine()!!.trimEnd().split(" ")

    val n = nr[0].toInt()

    val r = nr[1].toLong()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val ans = countTriplets(arr, r)

    println(ans)
}
