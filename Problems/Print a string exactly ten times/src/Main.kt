import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val phrase = scanner.nextLine()!!

    repeat(10) {
        println(phrase)
    }
}