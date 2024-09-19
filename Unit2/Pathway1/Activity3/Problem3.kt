fun main() {
    var favoriteActor: String = "Sandra Oh"
    println(favoriteActor.length)
}
// 9

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
}
// 9

fun main() {
    var favoriteActor: String? = null
    println(favoriteActor?.length)
}
// null

fun main() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)
}
// 9

fun main() {
    var favoriteActor: String? = "Sandra Oh"

    if (favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    }
}
// The number of characters in your favorite actor's name is 9.

fun main() {
    var favoriteActor: String? = null

    if(favoriteActor != null) {
      println("The number of characters in your favorite actor's name is ${favoriteActor.length}.")
    } else {
      println("You didn't input a name.")
    }
}
// You didn't input a name.

fun main() {
    val favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if(favoriteActor != null) {
      favoriteActor.length
    } else {
      0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}
// The number of characters in your favorite actor's name is 9.