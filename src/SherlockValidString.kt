import java.util.*

// Complete the isValid function below.
fun isValid(s: String): String {
    val azArr = CharArray(26)
    val countArr = IntArray(26) { 0 }
    val mapCount = mutableMapOf<Int, Int>()
    ('a'..'z').forEachIndexed { index, c ->
        azArr[index] = c
    }
    for (i in s.indices) {
        countArr[azArr.indexOf(s[i])]++
    }
    for (i in countArr.indices) {
        if (countArr[i] > 0) {
            if (mapCount.containsKey(countArr[i]))
                mapCount[countArr[i]] = (mapCount[countArr[i]] ?: 0) + 1
            else
                mapCount[countArr[i]] = 1
        }
    }
    when {
        mapCount.size <= 1 -> return "YES"
        mapCount.size == 2 -> {
            var first = true
            var min = 0
            mapCount.forEach { (_, u) ->
                if (first) {
                    min = u
                    first = true
                } else {
                    if (u < min)
                        min = u
                }
            }
            return if (min >= 2) "NO"
            else "YES"
        }
        else -> return "NO"
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = isValid(s)

    println(result)
}