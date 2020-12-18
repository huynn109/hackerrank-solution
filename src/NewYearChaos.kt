import java.util.*

// Complete the minimumBribes function below.
fun minimumBribes(q: Array<Int>): Unit {
    var isChaoTic = false
    var bribes = 0
    for (i in q.indices) {
        if ((q[i] - (i + 1)) > 2) isChaoTic = true
        if ((q[i] - 2) < i ) for (j in (q[i] - 2) until i) {
            if (j >=0 && q[j] > q[i]) bribes++
        }
    }
    if (isChaoTic) {
        println("Too chaotic")
    } else {
        println("$bribes")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val n = scan.nextLine().trim().toInt()

        val q = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

        minimumBribes(q)
    }
}