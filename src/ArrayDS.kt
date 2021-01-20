import java.util.*

// Complete the reverseArray function below.
fun reverseArray(a: Array<Int>): Array<Int> {
    if (a.isEmpty()) return a
    val result = IntArray(a.size)
    val lastIndex = a.lastIndex
    for (i in 0..lastIndex)
        result[lastIndex - i] = a[i]
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val arrCount = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val res = reverseArray(arr)

    println(res.joinToString(" "))
}
