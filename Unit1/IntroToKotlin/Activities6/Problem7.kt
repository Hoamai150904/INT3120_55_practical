// Bước 1
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val result = firstNumber + secondNumber
    println("$firstNumber + $secondNumber = $result")
}

// Bước 2
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

fun add(a: Int, b: Int): Int {
    val total = a + b
    return total
}

// Bước 3
fun subtract(a: Int, b: Int): Int {
    val sub = a - b
    return sub
}
fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = subtract(firstNumber, secondNumber)
    val anotherResult = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $result")
    println("$firstNumber - $thirdNumber = $anotherResult")
}

