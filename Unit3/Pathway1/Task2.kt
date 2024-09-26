// Định nghĩa enum class Daypart
enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}

// Định nghĩa data class Event
data class Event(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)

fun main() {
    // Tạo một instance của Event sử dụng Daypart enum
    val event = Event(
        title = "Study Kotlin",
        description = "Commit to studying Kotlin at least 15 minutes per day.",
        daypart = Daypart.EVENING,  // Sử dụng Daypart enum
        durationInMinutes = 15
    )

    // In ra đối tượng event để kiểm tra kết quả
    println(event)
}
