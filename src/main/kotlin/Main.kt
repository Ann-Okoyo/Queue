fun main() {
    var q=Queue(5)
    q.enqueue(1)
    q.enqueue(2)
    q.enqueue(3)
    q.dequeue()
    q.display()
    q.enqueue(45)
    q.enqueue(32)
    q.enqueue(64)
    q.enqueue(32)

}

class Queue(var capacity: Int) {
    var data = IntArray(capacity)
    var front = 0
    var rear = 0

    fun enqueue(value: Int) {
        if(isfull()){
            println("Queue is full")
            return
        }
        data [rear] = value
        rear++


    }

    fun dequeue(): Int? {
        if(isEmpty()){

            return null

        }
        return data[front]

    }

    fun peek(): Int? {
        if (isEmpty()) {
            return null
        }
         var removed= data[front]
        for (i in front  until rear -1)

    }

    fun isfull(): Boolean {
        return rear == capacity

    }

    fun isEmpty(): Boolean {
        return front == rear

    }

    fun display() {
        if(isEmpty()){
            return
        }

        for (i in front until rear
            println(data)

    }


}
