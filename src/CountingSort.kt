import java.util.*

fun countingSort(n: Int, ar: Array<Int>) {
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
    outPut.forEach {
        print("$it ")
    }
}

fun maximum(arr: Array<Int>): Int {
    var max = 0;
    for (value in arr) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    countingSort(n, ar)
}