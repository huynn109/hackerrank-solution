import java.util.*

// Complete the sherlockAndAnagrams function below.
fun sherlockAndAnagrams(s: String): Int {
    val allSubString = mutableListOf<String>()
    for (i in s.indices) {
        for (j in i + 1..s.length) {
            allSubString.add(s.slice(i until j))
        }
    }
    var countAnagram = 0
    for (i in allSubString.indices) {
        for (j in 0 until i) {
            if (allSubString[i].length == allSubString[j].length && isAnagram(allSubString[i], allSubString[j]))
                countAnagram++
        }
    }
    return countAnagram
}

fun isAnagram(current: String, inArrSubStr: String): Boolean {
    val arrChar = IntArray(26)
    for (i in current.indices) {
        arrChar[current[i] - 'a']++
    }
    for (j in inArrSubStr.indices) {
        arrChar[inArrSubStr[j] - 'a']--
    }
    arrChar.forEach {
        if (it != 0) return false
    }
    return true
}


fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = sherlockAndAnagrams(s)

        println(result)
    }
}