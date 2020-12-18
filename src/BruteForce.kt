import java.util.*

// Complete the bruteForce function below.
fun bruteForce(sum: Int, arr: Array<Int>): Int {
    
    return 0
}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd()

    val n = first_multiple_input.toInt()

    val s = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = nonDivisibleSubset(n, s)

    println(result)
}