package day2.queue;

public class QueueUsingStack {

        private java.util.Stack<Integer> stack1;
        private java.util.Stack<Integer> stack2;
    
        public QueueUsingStack() {
            this.stack1 = new java.util.Stack<>();
            this.stack2 = new java.util.Stack<>();
        }
    
        public void enqueue(int value) {
            stack1.push(value);
        }
    
        public int dequeue() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (!stack2.isEmpty()) {
                return stack2.pop();
            } else {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1; // Return -1 to indicate queue is empty
            }
        }
    
        public int peek() {
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            if (!stack2.isEmpty()) {
                return stack2.peek();
            } else {
                System.out.println("Queue is empty. Cannot peek.");
                return -1; // Return -1 to indicate queue is empty
            }
        }
    
        public boolean isEmpty() {
            return stack1.isEmpty() && stack2.isEmpty();
        }
    
        public static void main(String[] args) {
            QueueUsingStack queue = new QueueUsingStack();
            queue.enqueue(10);
            queue.enqueue(20);
            queue.enqueue(30);
            
            System.out.println("Dequeue: " + queue.dequeue()); // Should print 10
            System.out.println("Peek: " + queue.peek()); // Should print 20
            System.out.println("Dequeue: " + queue.dequeue()); // Should print 20
            System.out.println("Is Empty: " + queue.isEmpty()); // Should print false
            
            System.out.println("Dequeue: " + queue.dequeue()); // Should print 30
            System.out.println("Is Empty: " + queue.isEmpty()); // Should print true
        }
    
}
