import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val n = scanner.nextInt()
    var sum = 0

    for (i in 1..n) {
        val num = scanner.nextInt()
        sum += num
    }
    println(sum)
}