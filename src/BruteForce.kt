import java.util.*
import kotlin.collections.HashMap

// Complete the bruteForce function below.
fun bruteForce(sum: Int, arr1: MutableList<Int>, arr2: Array<Int>): Int? {
    var a = mapOf<String, String>()
    val l1 = arr1.size
    val l2 = arr2.size
    val map = mutableMapOf<Int, Int>()
    if (l1 < l2){
        for (i in arr1.indices){
            map[arr1[i]] = arr1[i]
        }
    }
    for (i in arr2.indices){
        if (map.containsKey(arr2[i]))
            return map[arr2[i]]
    }
    return 0
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd()

    val n = first_multiple_input.toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(n, s)

    println(result)
}