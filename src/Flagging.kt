import java.util.*
import kotlin.collections.ArrayList


fun findFlagging(a: Array<Int>, n: Int) {
    var sum = 0
    a.forEach { sum += it }
    var arrayListA = arrayListOf<Int>().apply { add(a[a.size - 1]) }
    var arrayListB = arrayListOf<Int>().apply { add(a[a.size - 2]) }
    for (i in a.size - 3 downTo 0){
        var sumA = 0
        var sumB = 0
        arrayListA.forEach { sumA += it }
        arrayListB.forEach { sumB += it }
        if (sumA < sumB && sumA < sum / 2)
            arrayListA.add(a[i])
        else arrayListB.add(a[i])
    }
    arrayListA.forEach {
        println(it)
    }
    var s1 = 0
    var s2 = 0
    arrayListA.forEach { s1 += it }
    arrayListB.forEach { s2 += it }
    println("$s1 - $s2")
}

fun findFlaggingQHD(a: Array<Int>, n: Int){

}

/*
10
46300 48600 53700 58000 66000 89100 101700 104900 125800 134400

413800 414700
53700 58000 66000 101700 134400 = 413800
46300 48600 89100 104900 125800 = 414700
 */
fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val ar = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    findFlagging(ar, n)
}