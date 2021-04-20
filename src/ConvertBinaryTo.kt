import java.lang.Math.pow
import java.util.*
import kotlin.math.pow

fun solution(S: String): Int {
    var sum = 0.0
    var result = 0
    S.reversed().forEachIndexed { k, v ->
        sum += v.toString().toInt() * 2.0.pow(k.toDouble())
    }
    while (sum > 0) {
        when {
            sum % 2 == 0.0 -> sum /= 2
            else -> --sum
        }
        result++
    }
    return result
}

fun findResult(sum: Double, result: Int): Int {
    return if (sum == 0.0)
        result
    else {
        var s = sum
        var r = result

        findResult(s, r)
    }
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arr = scan.nextLine()

    val res = solution(arr)

    println(res)
}