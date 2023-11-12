package stackQueue;

import java.util.Stack;

public class t150 {
    class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < tokens.length; i++) {
                int after;
                switch (tokens[i]) {
                    case "+":
                        stack.push(stack.pop() + stack.pop());
                        break;
                    case "-":
                        after = stack.pop();
                        stack.push(stack.pop() - after);
                        break;
                    case "*":
                        stack.push(stack.pop() * stack.pop());
                        break;
                    case "/":
                        after = stack.pop();
                        stack.push(stack.pop() / after);
                        break;
                    default:
                        stack.push(Integer.parseInt(tokens[i]));
                }
            }
            return stack.pop();
        }
    }
}
