// Complete the findLonely function below.
fun findLonely(arr: Array<Int>): Int {
    var result = 0
    for (i in arr) {
        result = result xor i
    }
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val res = findLonely(arr)

    println(res)
}