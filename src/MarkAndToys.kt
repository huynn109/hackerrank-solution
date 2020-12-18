import java.util.*

// Complete the maximumToys function below.
fun maximumToys(prices: Array<Int>, k: Int): Int {
    var sum = 0
    var count = 0
    for (i in prices.indices) {
        for (j in 0 until prices.size - 1) {
            if (prices[j] < prices[j + 1]) {
                val tmp = prices[j]
                prices[j] = prices[j + 1]
                prices[j + 1] = tmp
            }
        }
        if ((sum + prices[(prices.size - 1 - i)]) <= k){
            sum += prices[(prices.size - 1 - i)]
            count++
        } else return count
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val nk = scan.nextLine().split(" ")

    val n = nk[0].trim().toInt()

    val k = nk[1].trim().toInt()

    val prices = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = maximumToys(prices, k)

    println(result)
}