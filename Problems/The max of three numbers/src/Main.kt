import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()

    println(if (a > c && a > b) {
        // put your code here
        a

    } else if (b > a && b > c){
        // and here
        b
    } else
        c
        )
}