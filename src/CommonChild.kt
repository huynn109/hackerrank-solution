import java.util.*
import kotlin.math.max

// Complete the commonChild function below.
fun commonChild(s1: String, s2: String): Int {
    val arrayOfIntArrays = Array(s1.length + 1) { IntArray(s2.length + 1) }
    for (i in 0..s1.length) {
        for (j in 0..s2.length) {
            if (i == 0 || j == 0) arrayOfIntArrays[i][j] = 0
            else if (s1[i - 1] == s2[j - 1]) {
                arrayOfIntArrays[i][j] = arrayOfIntArrays[i - 1][j - 1] + 1
            } else {
                arrayOfIntArrays[i][j] = max(arrayOfIntArrays[i - 1][j], arrayOfIntArrays[i][j - 1])
            }
        }
    }
    return arrayOfIntArrays[s1.length][s2.length]
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s1 = scan.nextLine()

    val s2 = scan.nextLine()

    val result = commonChild(s1, s2)

    println(result)
}