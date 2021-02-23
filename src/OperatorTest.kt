import java.util.*

// Complete the jumpingOnClouds function below.
// 00000101000000010000101111100110 => 83954662
// 00000010100000001000010111110011 => 41977331
// 0000010100000001 => 1281

fun operatorTest(c: Array<Int>): Int {
//    println(1 xor 0)
//    println(1 xor 1)
//    println(1 xor 2)
//    println((1 xor 0) xor 2)
//    println(1 xor (0 xor 2))
    val map1 = hashMapOf<Int, Int>()
    for (i in 0 .. 2){
        map1[i - 1] = 1
    }
    for (i in 0 .. 2){
        map1[i -1]
    }
//    val a = Int.hashCode()
//    println(a)
//    println(a.ushr(16))
//    println((Int.MAX_VALUE / 2).and(a.xor(a.ushr(16))))
//    println(a.xor(a.ushr(16)))
    return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val c = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()

    val result = operatorTest(c)

//    println(result)
}