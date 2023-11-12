package string;

import java.util.Stack;

public class t151 {
    public static void main(String[] args) {

    }

    public String reverseWords(String s) {
        char[] cs = s.toCharArray();
        String temp = "";
        int start = 0;
        int end = s.length() - 1;
        while (cs[start] == ' ') start++;
        while (cs[end] == ' ') end--;
        Stack<String> stack = new Stack<>();
        for (int i = start; i <= end + 1; i++) {
            if (i == end + 1 || cs[i] == ' ') {
                if (!temp.isEmpty()) {
                    stack.push(temp);
                    temp = "";
                }
            } else {
                temp = temp + cs[i];
            }
        }
        String res = "";
        while (!stack.isEmpty()) {
            if (stack.size() == 1) {
                res = res + stack.pop();
            } else {
                res = res + stack.pop() + " ";
            }
        }
        return res;
    }
}
