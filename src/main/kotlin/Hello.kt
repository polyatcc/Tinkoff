import java.util.*
class CustomException(message: String) : Exception(message)
fun main() {
    try {
        val queue = Queue<Int>()
        /* 
        что происходит в форах для очереди:
        фор №1: закинули в очередь 20, 18, 16, ... 0
        фор №2: выкинули из очереди первые 3 элемента, остались 14, 12, 10, 8, ... 0
        кинули в очередь 3, получили 14, 12, 10, 8, ... 0, 3
        фор №3: выкинули все оставшиеся 9 элементов и вывели их: 14, 12, 10, 8, 6, 4, 2, 0, 3
        */
        for (i in 20 downTo 0 step 2) {
            queue.enqueue(i)
        }
        for (i in 1..3) {
            queue.dequeue()
        }
        queue.enqueue(3)
        for (i in 1..9) {
            println(queue.dequeue())
        }
        val stack = Stack<Int>()
        /* 
        что происходит в форах для стека:
        фор №1: закинули в очередь 20, 18, 16, ... 0
        фор №2: выкинули из стека последние 3 элемента, остались 20, 18, 16 14, 12, 10, 8, 6
        кинули в очередь 3, получили 20, 18, 16 14, 12, 10, 8, 6, 3
        фор №3: так как стек, каждый раз выкидываем последний элемент и выводим его. всего элементов 9: 3, 6, 8, 10, 12, 14, 16, 18, 20
        */
        for (i in 20 downTo 0 step 2) {
            stack.push(i)
        }
        for (i in 1..3) {
            stack.pop()
        }
        stack.push(3)
        for (i in 1..10) {
            println(stack.pop())
        }
    }
    catch (e: CustomException) {
        println(e.message)
    }
}
