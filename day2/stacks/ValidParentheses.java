package day2.stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
    

    public boolean isValid(String s) {
    Deque<Character> stack = new ArrayDeque<>();
    
    for (char c : s.toCharArray()) {
        if (c == '(' || c == '{' || c == '[') {
            stack.push(c);
        } else {
            if (stack.isEmpty()) return false;
            char top = stack.pop();
            if ((c == ')' && top != '(') || 
                (c == '}' && top != '{') || 
                (c == ']' && top != '[')) {
                return false;
            }
        }
    }
    return stack.isEmpty();
}

    public static void main(String[] args) {
        ValidParentheses solution = new ValidParentheses();
        String s = "({[]})";
        boolean result = solution.isValid(s);
        System.out.println("Is the string of parentheses valid? " + result);
    }
    
    
}
