import java.util.*

// write your code here

/* Do not change code below */
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val number = scanner.nextInt()
    println(square(number))
}

fun square(a: Int) : Int {
    val result = a * a
    return result
}