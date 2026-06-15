package day2.stacks;

public class CustomStack {

     // Implement the stack using an array or linked list as needed
        // Include methods like push, pop, peek, isEmpty, etc.
        private int maxSize;
        private int[] stackArray;   
        private int top;
        public CustomStack() {
            this.maxSize = 100; // Default size, can be modified as needed
            this.stackArray = new int[maxSize];
            this.top = -1;
        }

        public void push(int value) {
            if (top < maxSize - 1) {
                stackArray[++top] = value;
            } else {
                System.out.println("Stack overflow");
            }
        }

        public int pop() {
            if (top >= 0) {
                return stackArray[top--];
            } else {
                System.out.println("Stack underflow");
                return -1; // Return a sentinel value or throw an exception
            }
        }

        public int peek() {
            if (top >= 0) {
                return stackArray[top];
            } else {
                System.out.println("Stack is empty");
                return -1; // Return a sentinel value or throw an exception
            }
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public static void main(String[] args) {
            // Example usage of CustomStack
            CustomStack stack = new CustomStack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
    
            System.out.println("Top element: " + stack.peek()); // Should print 30
            System.out.println("Popped element: " + stack.pop()); // Should print 30
            System.out.println("Top element after pop: " + stack.peek()); // Should print 20

            System.out.println("Is stack empty? " + stack.isEmpty()); // Should print false
            stack.pop();
            stack.pop();
            System.out.println("Is stack empty after popping all elements? " + stack.isEmpty()); // Should print true

        }
    
       
    
}
