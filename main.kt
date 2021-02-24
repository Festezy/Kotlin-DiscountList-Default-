import java.text.NumberFormat
import java.util.*

fun main() {
    /** Latihan 3 */
    val price = 10000000
    val discount : Int
    val totalPrice : String

    if(price in 0..500000){
        discount = 5
    } else if (price in 500000..750000){
        discount = 10
    } else if (price in 750000..1000000){
        discount = 15
    } else if (price>=1000000){
        discount = 30
    } else {
        discount = 0
    }

    totalPrice = if (discount!= 0){
        NumberFormat.getCurrencyInstance(Locale("in", "ID"))
            .format(price-((price * discount)/ 100))
    } else {
        NumberFormat.getCurrencyInstance(Locale("in", "ID"))
            .format(0)
    }
    println("Harga : ${NumberFormat.getCurrencyInstance(Locale("in", "ID")).format(price)}\n"
            + "Diskon : ${discount}% \nTotal harga : $totalPrice")
}
