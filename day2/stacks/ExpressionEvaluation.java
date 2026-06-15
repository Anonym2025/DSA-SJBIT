package day2.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExpressionEvaluation {
    

    public static int evaluatePostfix(String exp) {
    Deque<Integer> stack = new ArrayDeque<>();

    for (int i = 0; i < exp.length(); i++) {
        char c = exp.charAt(i);

        if (Character.isDigit(c)) {
            stack.push(c - '0'); // Convert char to int
        } else {
            int val1 = stack.pop(); // Right operand
            int val2 = stack.pop(); // Left operand

            switch (c) {
                case '+': stack.push(val2 + val1); break;
                case '-': stack.push(val2 - val1); break;
                case '*': stack.push(val2 * val1); break;
                case '/': stack.push(val2 / val1); break;
            }
        }
    }
    return stack.pop();
}

    public static void main(String[] args) {
        String exp = "231*+9-";
        int result = evaluatePostfix(exp);
        System.out.println("The result of the postfix expression is: " + result);
    }
}
