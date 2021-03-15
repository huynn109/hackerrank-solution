import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.set

fun groupSort(arr: Array<Int>): Array<Array<Int>> {
    val mapTmp = HashMap<Int, Int?>()
    for (i in arr.indices) {
        if (mapTmp.contains(arr[i])) mapTmp[arr[i]] = mapTmp[arr[i]]?.plus(1)
        else mapTmp[arr[i]] = 1
    }
    return mapTmp.toSortedMap(compareByDescending { it }).toMap().entries.map {
        arrayOf(it.key,
            it.value ?: 0)
    }.toTypedArray()
//    return mapTmp.entries.sortedByDescending { it.value }.associateBy({ it.key }, { it.value }).toMap().entries.map {
//        arrayOf(it.key,
//            it.value ?: 0)
//    }.toTypedArray()
//    return mapTmp.toList().sortedByDescending { (_, value) -> value }.toMap().entries.map {
//        arrayOf(it.key,
//            it.value ?: 0)
//    }.toTypedArray()
}

class SortValue(var value: String, var fre: Int)
class MapSort : Comparator<SortValue> {
    // complete this method
    override fun compare(a: SortValue, b: SortValue): Int {
        return when {
            a.fre < b.fre -> 1
            a.fre == b.fre -> {
                a.value.compareTo(b.value)
            }
            else -> -1
        }
    }
}

fun main(args: Array<String>) {
    val arrCount = readLine()!!.trim().toInt()

    val arr = Array<Int>(arrCount, { 0 })
    for (i in 0 until arrCount) {
        val arrItem = readLine()!!.trim().toInt()
        arr[i] = arrItem
    }

    val result = groupSort(arr)

    println(result.map { it.joinToString(" ") }.joinToString("\n"))
}