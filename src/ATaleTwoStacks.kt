import java.util.*

fun main(args: Array<String>) {
    val aTaleTwoStacks = ATaleTwoStacks()
    val scan = Scanner(System.`in`)
    val size = scan.nextLine().toInt()
    for (i in 0 until size) {
        val rowSplit = scan.nextLine().split(" ")
        when (rowSplit[0].trim().toInt()) {
            1 -> aTaleTwoStacks.enqueue(rowSplit[1].trim().toInt()) // enqueue
            2 -> aTaleTwoStacks.dequeue() // dequeue
            3 -> println(aTaleTwoStacks.peek()) // peek
        }
    }
}

class ATaleTwoStacks {
    private val stackEnqueue = Stack<Int>()
    private val stackDequeue = Stack<Int>()

    fun peek(): Int {
        reverseEnqueue()
        return stackDequeue.peek()
    }

    fun enqueue(data: Int) {
        stackEnqueue.push(data)
    }

    fun dequeue() {
        reverseEnqueue()
        stackDequeue.pop()
    }

    private fun reverseEnqueue() {
        if (stackDequeue.isNotEmpty()) return
        while (stackEnqueue.isNotEmpty()){
            stackDequeue.push(stackEnqueue.pop())
        }
    }
}