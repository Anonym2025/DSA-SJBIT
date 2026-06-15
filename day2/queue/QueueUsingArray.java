package day2.queue;

public class QueueUsingArray {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int nItems;

    public QueueUsingArray(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0; // Points to the front of the queue
        this.rear = -1; // Points to the rear of the queue
        this.nItems = 0; // Number of items in the queue
    }

    public void enqueue(int value) {
        if (nItems < maxSize) {
            rear = (rear + 1) % maxSize; // Circular increment
            queueArray[rear] = value;
            nItems++;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + value);
        }
    }

    public int dequeue() {
        if (nItems > 0) {
            int temp = queueArray[front];
            front = (front + 1) % maxSize; // Circular increment
            nItems--;
            return temp;
        } else {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 to indicate queue is empty
        }
    }

    public int peek() {
        if (nItems > 0) {
            return queueArray[front];
        } else {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 to indicate queue is empty
        }
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public static void main(String[] args) {
        QueueUsingArray queue = new QueueUsingArray(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek()); // Should print 10

        System.out.println("Dequeued element: " + queue.dequeue()); // Should print 10
        System.out.println("Front element after dequeue: " + queue.peek()); // Should print 20

        queue.enqueue(40);
        System.out.println("Front element after enqueueing 40: " + queue.peek()); // Should print 20
    }
    
}
