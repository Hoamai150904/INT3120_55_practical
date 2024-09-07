/* Hàm sai
fun main() {
    val discountPercentage: Int = 0 <Trình khởi tạo ở đây là khá dư thừa>
    val offer: String = ""          <Trình khởi tạo ở đây là khá dư thừa>
    val item = "Google Chromecast"
    discountPercentage = 20         <val có thể hiểu là hằng trong một số ngôn ngữ lập trình khác không thể gán lại giá trị dẫn đến lỗi>
    offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
*/
fun main() {
    val discountPercentage = 20
    val item = "Google Chromecast"
    val offer = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"
    println(offer)
}