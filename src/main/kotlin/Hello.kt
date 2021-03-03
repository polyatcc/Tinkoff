import java.util.*

fun main() {
    val queue = Queue<Int>()
    for (i in 20 downTo 0 step 2) {
        queue.enqueue(i)
    }
    for (i in 1 .. 3) {
        queue.dequeue()
    }
    queue.enqueue(3)
    for (i in 1 .. 9) {
        println(queue.dequeue())
    }
    val stack = Stack<Int>()
    for (i in 20 downTo 0 step 2) {
        stack.push(i)
    }
    for (i in 1 .. 3) {
        stack.pop()
    }
    stack.push(3)
    for (i in 1 .. 9) {
        println(stack.pop())
    }
}