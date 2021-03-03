import java.lang.Exception
import java.util.*

class Stack<E> {
    var list = LinkedList<E>()
    fun push(elem : E) {
        list.add(elem)
    }
    fun pop() : E {
        if (!list.isEmpty()) {
            return list.pollLast()
        }
        else
            throw Exception ("Stack is empty")
    }
}