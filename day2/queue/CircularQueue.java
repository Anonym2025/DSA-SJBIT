package day2.queue;

public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public void enqueue(int value) {
        if (size == capacity) {
            System.out.println("Queue is full. Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queue[rear] = value;
        size++;
    }

    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Return -1 to indicate queue is empty
        }
        int temp = queue[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
        return temp;
    }

    public int peek() {
        if (size == 0) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Return -1 to indicate queue is empty
        }
        return queue[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
    
}
