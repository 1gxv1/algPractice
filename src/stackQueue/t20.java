package stackQueue;

import java.util.Stack;

public class t20 {
    class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<Character>();
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case ')':
                        if (stack.isEmpty() || stack.pop() != '(') return false;
                        break;
                    case '}':
                        if (stack.isEmpty() || stack.pop() != '{') return false;
                        break;
                    case ']':
                        if (stack.isEmpty() || stack.pop() != '[') return false;
                        break;
                    default:
                        stack.push(s.charAt(i));
                        break;
                }
            }
            return stack.isEmpty();
        }
    }
}
