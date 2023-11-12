package stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class t225 {
    class MyStack {
        Queue<Integer> oneQueue;
        Queue<Integer> secondQueue;

        public MyStack() {
            oneQueue = new LinkedList<>();
            secondQueue = new LinkedList<>();
        }

        public void push(int x) {
            if (!oneQueue.isEmpty()) oneQueue.add(x);
            else secondQueue.add(x);
        }

        public int pop() {
            if (oneQueue.isEmpty()) {
                while (secondQueue.size() > 1) {
                    oneQueue.add(secondQueue.remove());
                }
                return secondQueue.remove();
            } else {
                while (oneQueue.size() > 1) {
                    secondQueue.add(oneQueue.remove());
                }
                return oneQueue.remove();
            }
        }

        public int top() {
            int res = 0;
            if (oneQueue.isEmpty()) {
                while (!secondQueue.isEmpty()) {
                    res = secondQueue.remove();
                    oneQueue.add(res);
                }
            } else {
                while (!oneQueue.isEmpty()) {
                    res = oneQueue.remove();
                    secondQueue.add(res);
                }
            }
            return res;
        }

        public boolean empty() {
            return oneQueue.isEmpty() && secondQueue.isEmpty();
        }
    }

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
}
