/*
 * Complete the 'pickingNumbers' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY a as parameter.
 */

fun pickingNumbers(a: Array<Int>): Int {
    val tempArr = IntArray(100) { 0 }
    var result = 0
    a.forEach { tempArr[it]++ }
    for (i in 0 until tempArr.size - 1) {
        var sum = 0
        if (tempArr[i + 1] != 0)
            sum = tempArr[i + 1] + tempArr[i]
        if (sum > result) result = sum
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val a = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = pickingNumbers(a)

    println(result)
}
