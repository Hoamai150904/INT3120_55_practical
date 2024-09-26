// Định nghĩa data class Event
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: String,
    val durationInMinutes: Int,
)

fun main() {
    // Tạo một instance của Event
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = "Evening",
        durationInMinutes = 15
    )

    // In ra đối tượng event để kiểm tra kết quả
    println(event)
}
