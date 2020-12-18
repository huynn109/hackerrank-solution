import java.util.*

// Complete the makeAnagram function below.
fun makeAnagram(a: String, b: String): Int {
    val arrChar = IntArray(26)
    for (i in a.indices) {
        arrChar[a[i] - 'a']++
    }
    for (j in b.indices) {
        arrChar[b[j] - 'a']--
    }
    var count = 0
    arrChar.forEach { i ->
        count += (if (i < 0) -i else i)
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val a = scan.nextLine()

    val b = scan.nextLine()

    val res = makeAnagram(a, b)

    println(res)
}