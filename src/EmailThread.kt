import java.util.*


fun getEmailThreads(emails: Array<String>): Array<Array<Int>> {
    val result: MutableList<Array<Int>> = ArrayList()
    val mapThreadNumber: MutableMap<String, Int> = HashMap()
    val mapThreadPosition: MutableMap<Int, Int> = HashMap()
    var threadNumber = 0

    for (s in emails) {
        val emailSplit = s.split(", ")
        val sender = emailSplit[0]
        val receiver = emailSplit[1]
        val arraySorted: Array<String> = arrayOf(sender, receiver).sortedArray()
        val key = arraySorted[0] + arraySorted[1]
        if (mapThreadNumber.containsKey(key)) {
            val currentThreadNumber = mapThreadNumber[key]
            mapThreadPosition[currentThreadNumber!!] = (mapThreadPosition[currentThreadNumber] ?: 0) + 1
            val currentThreadPosition = mapThreadPosition[currentThreadNumber]
            result.add(arrayOf(currentThreadNumber, currentThreadPosition!!))
        } else {
            mapThreadNumber[key] = ++threadNumber
            mapThreadPosition[mapThreadNumber[key]!!] = 1
            result.add(arrayOf(mapThreadNumber[key]!!, mapThreadPosition[mapThreadNumber[key]!!]!!))
        }
    }

    return result.toTypedArray()
}

fun main(args: Array<String>) {
    val emailsCount = readLine()!!.trim().toInt()

    val emails = Array<String>(emailsCount, { "" })
    for (i in 0 until emailsCount) {
        val emailsItem = readLine()!!
        emails[i] = emailsItem
    }

    val result = getEmailThreads(emails)

    println(result.map { it.joinToString(" ") }.joinToString("\n"))
}