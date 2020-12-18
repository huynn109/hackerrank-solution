import java.util.*

fun staircase(n: Int): Unit {
    for (i in 1..n) {
        for (j in 1..n - i) {
            print(" ")
        }
        for (k in 1..i) {
            print("#")
        }
        println()
    }
}

fun staircase1(n: Int): Unit {
    for (i in 1..n) {
        println(" ".repeat(n - i) + "#".repeat(i));
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    val s = System.currentTimeMillis()
//    staircase(n)
    staircase1(n)
    val e = System.currentTimeMillis()
    print("Time: ${e - s}")
//    print("ABC".repeat(n))
}