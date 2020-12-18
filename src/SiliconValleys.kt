import kotlin.streams.toList

/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    var count = 0;
    var sea = 0
    val listHike: List<Char> = path.toList()
    listHike.forEach { hike ->
        if (hike.toString().toLowerCase() == "u") {
            sea++
            if (sea == 0) count++
        } else {
            sea--
        }
    }
    return count
}

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}