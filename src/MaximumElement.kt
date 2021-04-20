import java.util.*

fun getMax(operations: Array<String>): Array<Int> {
    val stackTmp = Stack<Int>()
    val result = arrayListOf<Int>()
    for (i in operations) {
        val splitI = i.split(" ").map { it.toInt() }
        when {
            splitI[0] == 1 -> {
                if (stackTmp.isEmpty())
                    stackTmp.push(splitI[1])
                else stackTmp.push(if (stackTmp.peek() > splitI[1]) stackTmp.peek() else splitI[1])
            }
            splitI[0] == 2 -> {
                stackTmp.pop()
            }
            splitI[0] == 3 -> {
                result.add(stackTmp.peek())
            }
        }
    }
    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ops = Array<String>(n) { "" }
    for (i in 0 until n) {
        val opsItem = readLine()!!
        ops[i] = opsItem
    }

    val res = getMax(ops)

    println(res.joinToString("\n"))
}