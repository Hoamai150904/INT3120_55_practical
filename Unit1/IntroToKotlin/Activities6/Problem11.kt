fun printWeatherInfo(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}

fun main() {
    printWeatherInfo("Ankara", 27, 31, 82)
    printWeatherInfo("Tokyo", 32, 36, 10)
    printWeatherInfo("Cape Town", 59, 64, 2)
    printWeatherInfo("Guatemala City", 50, 55, 7)
}