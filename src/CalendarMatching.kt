fun main() {
    val calendar1 = listOf(
        listOf("9:00", "10:30"),
        listOf("12:00", "13:00"),
        listOf("16:00", "18:00")
    )
    val dailyBounds1 = listOf("9:00", "20:00")
    val calendar2 = listOf(
        listOf("10:00", "11:30"),
        listOf("12:30", "14:30"),
        listOf("14:30", "15:00"),
        listOf("16:00", "17:00")
    )
    val dailyBounds2 = listOf("10:00", "18:30")
    calendarMatching(calendar1, dailyBounds1, calendar2, dailyBounds2, 30)
}

fun calendarMatching(
    calendar1: List<List<String>>,
    dailyBounds1: List<String>,
    calendar2: List<List<String>>,
    dailyBounds2: List<String>,
    meetingDuration: Int
): List<List<String>> {
    // Write your code here.


    return listOf<List<String>>()
}