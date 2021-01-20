import java.util.*

fun printArr1(a: IntArray, n: Int) {
    if (n == 0) return
    else {
        print("${a[n - 1]}")
        printArr1(a, n - 1)
    }
}

fun printArr2(a: IntArray, n: Int) {
    if (n == 0) return
    else {
        printArr2(a, n - 1)
        print("${a[n - 1]}")
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    printArr1(ar.toIntArray(), n)
    printArr2(ar.toIntArray(), n)

}