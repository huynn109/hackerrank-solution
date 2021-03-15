import javax.swing.text.html.HTML.Attribute.N


fun maxPairs(skillLevel: Array<Int>, minDiff: Int): Int {
    skillLevel.sort()
    var pairs = 0;
    var i = 0
    var j = 0
    while (i < skillLevel.size) {

    }

    return pairs
}
// 1 2 1 4 3 5
// 1 1 2 3 4 5

fun main(args: Array<String>) {
    val skillLevelCount = readLine()!!.trim().toInt()

    val skillLevel = Array<Int>(skillLevelCount, { 0 })
    for (i in 0 until skillLevelCount) {
        val skillLevelItem = readLine()!!.trim().toInt()
        skillLevel[i] = skillLevelItem
    }

    val minDiff = readLine()!!.trim().toInt()

    val result = maxPairs(skillLevel, minDiff)

    println(result)
}