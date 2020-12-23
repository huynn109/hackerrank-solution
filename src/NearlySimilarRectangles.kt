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


/*
 * Complete the 'nearlySimilarRectangles' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts 2D_LONG_INTEGER_ARRAY sides as parameter.
 */

fun nearlySimilarRectangles(sides: Array<Array<Long>>): Long {
    // Write your code here
    var m = mutableMapOf<Double, Int>()
    for (i in sides.indices){
        m[sides[i][0].toDouble() / sides[i][1].toDouble()] = (m[sides[i][0].toDouble() / sides[i][1].toDouble()] ?: 0) + 1
    }
    var s = 0
    m.forEach { (_, u) ->
        s += (u - 1)
    }
    return s.toLong()
}

fun main(args: Array<String>) {
    val sidesRows = readLine()!!.trim().toInt()
    val sidesColumns = readLine()!!.trim().toInt()

    val sides = Array<Array<Long>>(sidesRows, { Array<Long>(sidesColumns, { 0 }) })

    for (i in 0 until sidesRows) {
        sides[i] = readLine()!!.trimEnd().split(" ").map { it.toLong() }.toTypedArray()
    }

    val result = nearlySimilarRectangles(sides)

    println(result)
}
