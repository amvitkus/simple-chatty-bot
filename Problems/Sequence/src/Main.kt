import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    val ch1 = scanner.next().first()
    val ch2 = scanner.next().first()
    val ch3 = scanner.next().first()

    val check = ch1 + 1 == ch2 && ch1 + 1 != ch3 && ch2 + 1 == ch3

    println(check)
}