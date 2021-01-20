import java.util.*

/*
 * Complete the runningMedian function below.
 */
fun runningMedian(a: Array<Int>): Array<Double> {
    val countArr = Array(100000) { 0 }
    val result = Array(a.size) { 0.0 }
    for (i in a.indices) {
        countArr[a[i]]++
        result[i] = getMedian(countArr = countArr, d = i + 1)
    }
    return result
}

fun getMedian(countArr: Array<Int>, d: Int): Double {
    var sumCount = 0
    countArr.forEachIndexed { index, i ->
        sumCount += i
        if ((sumCount * 2) > d) return index.toDouble()
        if ((sumCount * 2) == d) return index + 0.5
    }
    return 0.0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val aCount = scan.nextLine().trim().toInt()

    val a = Array<Int>(aCount, { 0 })
    for (aItr in 0 until aCount) {
        val aItem = scan.nextLine().trim().toInt()
        a[aItr] = aItem
    }

    val result = runningMedian(a)

    println(result.joinToString("\n"))
}