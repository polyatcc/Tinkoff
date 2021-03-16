import java.lang.Exception
import java.util.*

class Queue<E> {
    var list = LinkedList<E>()
    fun enqueue(elem : E) {
        list.add(elem)
    }
    fun dequeue() : E {
        if (!list.isEmpty()) {
            return list.pollFirst()
        }
        else
            throw CustomException ("Queue is empty")
    }

}
