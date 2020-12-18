import java.util.*

// Complete the minimumSwaps function below.
fun minimumSwaps(arr: Array<Int>): Int {
    var count = 0
    val intArr = BooleanArray(arr.size)
    for (i in arr.indices){
        var j = i
        var cycle = 0
        while (!intArr[j]){
            intArr[j] = true
            j = arr[j] - 1
            cycle++
        }
        if (cycle != 0)
            count += ( cycle - 1)

    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = minimumSwaps(arr)

    println(res)
}