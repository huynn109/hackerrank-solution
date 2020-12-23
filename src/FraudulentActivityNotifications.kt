import java.util.*

// Complete the activityNotifications function below.
fun activityNotifications(expenditure: Array<Int>, d: Int): Int {
    val countArr = IntArray(201) { 0 }
    var notificationCount = 0

    for (i in 0 until d) {
        countArr[expenditure[i]]++
    }

    for (i in d until expenditure.size) {
        val median = getMedianX2(countArr, d)
        if (expenditure[i] >= median) notificationCount++
        if (i == expenditure.size - 1) break
        countArr[expenditure[i - d]]--
        countArr[expenditure[i]]++
    }
    return notificationCount
}

fun getMedianX2(countArray: IntArray, d: Int): Int {
    var sum = 0
    for (i in countArray.indices) {
        sum += countArray[i]
        if ((sum * 2) == d) return i * 2 + 1
        if ((sum * 2) > d) return i * 2
    }
    return 0
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