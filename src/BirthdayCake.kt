fun birthdayCakeCandles(candles: Array<Int>): Int {
    var result = candles[0]
    var count = 1
    for (i in 1 until candles.size) {
        if (candles[i] > result)
            result = candles[i]
        else if (result == candles[i])
            count++
    }
    return count
}

fun main(args: Array<String>) {
    val candlesCount = readLine()!!.trim().toInt()

    val candles = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = birthdayCakeCandles(candles)

    println(result)
}