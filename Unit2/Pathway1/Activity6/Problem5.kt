fun main() {
    val brunoSong = Song("Chúng ta không thuộc về nhau", "Sơn Tùng MTP", 2013, 222_000_000)
    brunoSong.printDescription()
    println(brunoSong.isPopular)
}

class Song(
    val title: String,
    val artist: String,
    val yearPublished: Int,
    val playCount: Int
){
    val isPopular: Boolean
        get() = playCount >= 1000

    fun printDescription() {
        println("$title, performed by $artist, was released in $yearPublished.")
    }
}

/* Chúng ta không thuộc về nhau, performed by Sơn Tùng MTP, was released in 2013.
   true */