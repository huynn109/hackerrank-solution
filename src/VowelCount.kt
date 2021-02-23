import kotlin.test.assertEquals

fun getCount(str: String): Int {
    val vowel = "aoeui";
    var result = 0
    str.forEach {
        if (vowel.contains(it)) result++
    }
    return result
}

