import java.util.*

// Complete the equalizeArray function below.
fun equalizeArray(arr: Array<Int>): Int {
    val arrTmp = IntArray(arr.size)
    var max: Int
    arr.forEachIndexed { index, i ->
        for (j in index + 1 until arr.size) {
            if (arr[j] == arr[index])
                arrTmp[index]++
        }
    }
    max = arrTmp[0]
    for (j in 1 until arrTmp.size) {
        if (arrTmp[j] > max)
            max = arrTmp[j]
    }

    return arr.size - (max + 1)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = equalizeArray(arr)

    println(result)
}