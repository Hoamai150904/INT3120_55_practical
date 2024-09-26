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
    // Tạo danh sách các sự kiện sử dụng MutableList
    val events = mutableListOf<Event>()

    // Thêm các sự kiện vào danh sách
    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
    events.add(Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15))
    events.add(Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30))
    events.add(Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60))
    events.add(Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45))

    // Lọc các sự kiện ngắn hơn 60 phút
    val shortEvents = events.filter { it.durationInMinutes < 60 }

    // In ra số lượng sự kiện ngắn
    println("You have ${shortEvents.size} short events.")
}
