fun main() {
        printFinalTemperature(30.0, "Celsius", "Fahrenheit") { 9.0 / 5.0 * it + 32 }
        printFinalTemperature(300.0, "Kelvin", "Celsius") { it - 273.15 }
        printFinalTemperature(20.0, "Fahrenheit", "Kelvin") { 5.0 / 9.0 * (it - 32) + 273.15 }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
/* 30.0 degrees Celsius is 86.00 degrees Fahrenheit.
   300.0 degrees Kelvin is 26.85 degrees Celsius.
   20.0 degrees Fahrenheit is 266.48 degrees Kelvin. */