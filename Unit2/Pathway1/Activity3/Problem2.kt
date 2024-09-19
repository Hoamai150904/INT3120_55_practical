fun main() {
    val favoriteActor = null
    println(favoriteActor)
}
//null

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}
/* Sandra Oh
   null
   */

fun main() {
    var number: Int? = 10
    println(number)
}
// 10

fun main() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}
/* 10
   null */
