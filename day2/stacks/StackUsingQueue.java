package day2.stacks;

public class StackUsingQueue {

        private java.util.Queue<Integer> queue1;
        private java.util.Queue<Integer> queue2;
    
        public StackUsingQueue() {
            this.queue1 = new java.util.LinkedList<>();
            this.queue2 = new java.util.LinkedList<>();
        }
    
        public void push(int value) {
            queue1.offer(value);
        }
    
        public int pop() {
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; // Return -1 to indicate stack is empty
            }
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int poppedValue = queue1.poll();
            // Swap the queues
            java.util.Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return poppedValue;
        }
    
        public int peek() {
            if (queue1.isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; // Return -1 to indicate stack is empty
            }
            while (queue1.size() > 1) {
                queue2.offer(queue1.poll());
            }
            int topValue = queue1.peek();
            // Move the last element to the second queue
            queue2.offer(queue1.poll());
            // Swap the queues
            java.util.Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
            return topValue;
        }
    
        public boolean isEmpty() {
            return queue1.isEmpty();
        }
    
        public static void main(String[] args) {
            StackUsingQueue stack = new StackUsingQueue();
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            System.out.println("Top element: " + stack.peek()); // Should print 30
    
            System.out.println("Popped element: " + stack.pop()); // Should print 30
            System.out.println("Top element after pop: " + stack.peek()); // Should print 20
    
            stack.push(40);
        }
    
}
