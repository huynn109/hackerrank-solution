import kotlin.math.min

fun chooseFlask(requirements: Array<Int>, flaskTypes: Int, markings: Array<Array<Int>>): Int {
    val listMap = markings.toList().map { mutableMapOf(it[0] to it[1]) }.toList().groupBy { it.keys }.toList()
    var result = -1
    for (i in listMap.indices) {
        val markGroup = listMap[i].second.toList()
        var sumMin = 0
        if (markGroup.last()[i] ?: -1 < requirements.last()) continue
        for (j in markGroup.indices) {
            val mark: Int = markGroup[j][i] ?: continue
            for (k in requirements.size - 1 downTo 0) {
                if (mark >= requirements[k]) {
                    if ((sumMin + mark - requirements[k]) > flaskTypes)
                        break
                    sumMin += (mark - requirements[k])
                }
            }
        }
        if (sumMin == flaskTypes)
            result = if (result > -1) min(result, i) else i
    }
    return result
}

fun main(args: Array<String>) {
    val requirementsCount = readLine()!!.trim().toInt()

    val requirements = Array<Int>(requirementsCount, { 0 })
    for (i in 0 until requirementsCount) {
        val requirementsItem = readLine()!!.trim().toInt()
        requirements[i] = requirementsItem
    }

    val flaskTypes = readLine()!!.trim().toInt()

    val markingsRows = readLine()!!.trim().toInt()
    val markingsColumns = readLine()!!.trim().toInt()

    val markings = Array<Array<Int>>(markingsRows, { Array<Int>(markingsColumns, { 0 }) })

    for (i in 0 until markingsRows) {
        markings[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    }

    val result = chooseFlask(requirements, flaskTypes, markings)

    println(result)
}