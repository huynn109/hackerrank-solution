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
 * Complete the 'decryptPassword' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 *
 * 51Pa*0Lp*0e
 */

fun decryptPassword(s: String): String {
    val c = s.toMutableList()
    val d = mutableListOf<Int>()
    for (i in c.size - 1 downTo 0) {
        if (c[i] == '*') {
            val tmp = c[i - 2]
            c[i - 2] = c[i - 1]
            c[i - 1] = tmp
        }
        if (c[i].isDigit() && c[i].toString().toInt() != 0) {
            d.add(c[i].toInt())
            c.removeAt(i)
        }
    }
    for (i in c.indices){
        if (c[i].isDigit() && c[i].toString().toInt() == 0) {
            c[i] = d.first().toChar()
            if (d.isNotEmpty()) d.removeAt(0)
        }
    }
    return c.joinToString(separator = "").replace("*", "")
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = decryptPassword(s)

    println(result)
}
