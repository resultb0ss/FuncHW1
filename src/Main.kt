import kotlin.math.pow

fun main() {

    var powNum = 5
    println(powNum myPow 2)

}

infix fun Int.myPow(n: Int): Int{
    return this.toDouble().pow(n).toInt()
}