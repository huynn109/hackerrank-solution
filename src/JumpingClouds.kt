import java.util.*

// Complete the jumpingOnClouds function below.
fun jumpingOnClouds(c: Array<Int>): Int {
    var i = 0;
    var count = 0
    while (i < c.size - 1) {
        when {
            i + 2 >= c.size -> {
                i++
                count++
            }
            c[i + 2] != 1 -> {
                i += 2
                count++
            }
            else -> {
                i++
                count++
            }
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}