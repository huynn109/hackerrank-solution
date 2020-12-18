import java.util.*
import kotlin.collections.HashSet

fun hadContainParingSum(a: Array<Int>, sum: Int): Boolean {
    val setTmp = HashSet<Int>()
    a.forEach {
        if (setTmp.contains(it))
            return true
        setTmp.add(sum - it)
    }
    return false
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val k = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    println("${hadContainParingSum(a, k)}")
}