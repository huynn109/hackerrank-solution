/*
 * Complete the 'nonDivisibleSubset' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER k
 *  2. INTEGER_ARRAY s
 */

fun nonDivisibleSubset(k: Int, s: Array<Int>): Int {
    val remains = IntArray(k)
    for (i in s.indices) {
        val index = s[i] % k
        remains[index]++
    }
    var result = 0
    if (remains[0] > 0) {
        result++
    }
    for (i in 1 until remains.size) {
        if (i == k - i) {
            result++
        } else {
            result += if (remains[i] >= remains[k - i]) {
                remains[i]
            } else {
                remains[k - i]
            }
            remains[i] = 0
            remains[k - i] = 0
        }
    }
    return result
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val n = first_multiple_input[0].toInt()

    val k = first_multiple_input[1].toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(k, s)

    println(result)
}