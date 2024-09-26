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

// Định nghĩa thuộc tính mở rộng cho lớp Event
val Event.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
}

fun main() {
    // Tạo danh sách các sự kiện sử dụng MutableList
    val events = mutableListOf<Event>()

    // Thêm các sự kiện vào danh sách
    events.add(Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0))
    events.add(Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15))
    events.add(Event(title = "Morning walk", daypart = Daypart.MORNING, durationInMinutes = 20))
    events.add(Event(title = "Learn about Kotlin", daypart = Daypart.AFTERNOON, durationInMinutes = 30))
    events.add(Event(title = "Practice Compose", daypart = Daypart.AFTERNOON, durationInMinutes = 60))
    events.add(Event(title = "Watch latest DevBytes video", daypart = Daypart.AFTERNOON, durationInMinutes = 10))
    events.add(Event(title = "Check out latest Android Jetpack library", daypart = Daypart.EVENING, durationInMinutes = 45))
    events.add(Event(title = "Evening relaxation", daypart = Daypart.EVENING, durationInMinutes = 30))

    // In ra số lượng sự kiện trong mỗi nhóm daypart
    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    // Sử dụng thuộc tính mở rộng durationOfEvent để in ra thời lượng sự kiện đầu tiên
    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}
