import java.util.*

// Complete the isBalanced function below.
fun isBalanced(s: String): String {
    val stack = Stack<String>()
    s.forEach {
        when {
            it.toString() == "{" -> stack.push("}")
            it.toString() == "[" -> stack.push("]")
            it.toString() == "(" -> stack.push(")")
            stack.isEmpty() || stack.pop() != it.toString() -> return "NO"
        }
    }
    return if (stack.isEmpty()) "YES" else "NO"
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val t = scan.nextLine().trim().toInt()

    for (tItr in 1..t) {
        val s = scan.nextLine()

        val result = isBalanced(s)

        println(result)
    }
}