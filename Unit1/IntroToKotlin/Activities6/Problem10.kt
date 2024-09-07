fun comparePhoneUsage(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}

fun main() {
    val timeSpentToday = 300
    val timeSpentYesterday = 250

    val result = comparePhoneUsage(timeSpentToday, timeSpentYesterday)

    if (result) {
        println("True")
    } else {
        println("False")
    }
}
