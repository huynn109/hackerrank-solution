import java.util.*

// Complete the activityNotifications function below.
fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    var notificationCount = 0
    for (i in d until expenditure.size) {
        val trail = countingSort(expenditure.slice(IntRange(i - d, i - 1)))
        val median = if (d % 2 == 0) {
            trail[trail.size / 2 - 1] + trail[trail.size / 2]
        } else
            trail[trail.size / 2] * 2
        if (median <= expenditure[i]) notificationCount++
    }
    return notificationCount
}


fun countingSort(ar: List<Int>): List<Int> {
    val outPut = IntArray(ar.size)
    val count = IntArray(maximum(ar) + 1) { 0 }
    for (i in ar.indices) {
        count[ar[i]]++
    }
    for (i in 1 until count.size){
        count[i] += count[i - 1]
    }
    for (i in ar.indices){
        outPut[count[ar[i]] - 1] = ar[i]
        --count[ar[i]];
    }
    return outPut.toList()
}

fun maximum(arr: List<Int>): Int {
    var max: Int = 0;
    for (value in arr) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nd = scan.nextLine().split(" ")

    val n = nd[0].trim().toInt()

    val d = nd[1].trim().toInt()

    val expenditure = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = activityNotifications(expenditure, d)

    println(result)
}