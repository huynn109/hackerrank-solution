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
    val arrTmp = IntArray(arr[arr.size - 1].toInt() + 1)
    var result = 1
    arr.forEach {
        arrTmp[it.toInt()]++
    }
    var tmp = 0
    arrTmp.forEach {
        if (it == 0 || it == 1) tmp++
        result *= tmp
    }
    return result.toLong()
}

fun main(args: Array<String>) {
    val nr = readLine()!!.trimEnd().split(" ")

    val n = nr[0].toInt()

    val r = nr[1].toLong()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()

    val ans = countTriplets(arr, r)

    println(ans)
}
