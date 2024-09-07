fun main() {
    val stepsWalked = 4000
    val caloriesBurned = calculateCaloriesBurned(stepsWalked)
    println("Walking $stepsWalked steps burns $caloriesBurned calories")
}

fun calculateCaloriesBurned(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}