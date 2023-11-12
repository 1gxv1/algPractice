package stackQueue;

import java.util.Stack;

public class t1047 {
    class Solution {
        public String removeDuplicates(String s) {
            Stack<Character> stack = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                if (!stack.isEmpty() && stack.peek() == s.charAt(i)) stack.pop();
                else stack.push(s.charAt(i));
            }
            StringBuilder res = new StringBuilder();
            while (!stack.isEmpty()) {
                res.append(stack.pop());
            }
            return String.valueOf(res.reverse());
        }
    }
}
