import java.util.*


/**
1 -> 1
2 -> 2
3 -> 4
4 -> 7
5 -> 13
n = 1 -> 1
n = 2 -> 2
n = 3 -> 4
f(1) -> 1
f(2) -> 2
f(3) -> 4
f(4) -> f(3) + f(2) + f(1) = 1 + 2 + 4 = 7
f(5) -> f(4) + f(3) + f(2)= 7 + 4 + 2= 13
=> f(n) -> (n - 1) + f(n - 1)
 */
private var cache = mutableMapOf<Int, Int>()
fun stepPerms(n: Int): Int {
    if (n <= 2) return n
    if (n == 3) return 4
    if (cache.containsKey(n)) return cache[n]!!
    val ways =  stepPerms(n - 1) + stepPerms(n - 2) + stepPerms(n - 3)
    cache[n] = ways
    return ways
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine().trim().toInt()

    for (sItr in 1..s) {
        val n = scan.nextLine().trim().toInt()

        val res = stepPerms(n)

        println(res)
    }
}