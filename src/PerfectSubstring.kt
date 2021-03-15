fun perfectSubstring(s: String, k: Int): Int {
    val s = s.toCharArray()
    var result = 0
    for (i in s.indices) {
        for (j in i + 1 until s.size) {
            val arrTmp = s.toList().subList(i, j).sorted()
            if (i == 2 && arrTmp[i] == arrTmp[j]) result++
            else if (arrTmp.size % 2 != 0) {

            }
        }
    }
    return result
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val k = readLine()!!.trim().toInt()

    val result = perfectSubstring(s, k)

    println(result)
}