package day2.stacks;

public class StackUsingArray {

        private int maxSize;
        private int[] stackArray;
        private int top;
    
        public StackUsingArray(int size) {
            this.maxSize = size;
            this.stackArray = new int[maxSize];
            this.top = -1; // Indicates an empty stack
        }
    
        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
            } else {
                System.out.println("Stack is full. Cannot push " + value);
            }
        }
    
        public int pop() {
            if (top >= 0) {
                return stackArray[top--];
            } else {
                System.out.println("Stack is empty. Cannot pop.");
                return -1; // Return -1 to indicate stack is empty
            }
        }
    
        public int peek() {
            if (top >= 0) {
                return stackArray[top];
            } else {
                System.out.println("Stack is empty. Cannot peek.");
                return -1; // Return -1 to indicate stack is empty
            }
        }
    
        public boolean isEmpty() {
            return (top == -1);
        }
    
        public boolean isFull() {
            return (top == maxSize - 1);
        }
    
        public static void main(String[] args) {
            StackUsingArray stack = new StackUsingArray(5);
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            System.out.println("Top element: " + stack.peek()); // Should print 30
    
            System.out.println("Popped element: " + stack.pop()); // Should print 30
            System.out.println("Top element after pop: " + stack.peek()); // Should print 20
    
            stack.push(40);
            stack.push(50);
            stack.push(60); // This should indicate that the stack is full
    
            while (!stack.isEmpty()) {
                System.out.println("Popped element: " + stack.pop());
            }
    
            stack.pop(); // This should indicate that the stack is empty
        }
    
}
