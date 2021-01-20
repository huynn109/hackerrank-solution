import java.util.*

// Complete the insertSort function below.
fun insertSort(a: Array<Int>) {
    for (i in 1 until a.size) {
        var j: Int = i
        while (j > 0 && a[j - 1] > a[j]) {
            val t = a[j]
            a[j] = a[j - 1]
            a[j - 1] = t
            j--
        }
    }
    a.forEach {
        print("$it ")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val a = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    insertSort(a)
}