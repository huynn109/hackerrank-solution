import java.util.*

/*
 * Complete the timeConversion function below.
 */
fun timeConversion(s: String): String {
    if (s.contains("AM").not() && s.contains("PM").not()) return s
    var hour: Int
    var minute: Int
    var second: Int
    val timeTmp: List<Int> = if (s.contains("AM")) {
        s.split("AM")[0].split(":").apply {
            hour = this[0].toInt()
            minute = this[1].toInt()
            second = this[2].toInt()
            if (hour == 12) hour = 0
        }
        listOf(hour, minute, second)
    } else {
        s.split("PM")[0].split(":").apply {
            hour = this[0].toInt()
            minute = this[1].toInt()
            second = this[2].toInt()
            if (hour < 12)
                hour = hour.plus(12)
        }
        listOf(hour, minute, second)
    }
    return String.format("%02d:%02d:%02d", timeTmp[0], timeTmp[1], timeTmp[2])
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = timeConversion(s)

    println(result)
}