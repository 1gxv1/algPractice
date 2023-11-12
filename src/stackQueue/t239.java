package stackQueue;

import java.util.Arrays;
import java.util.LinkedList;


public class t239 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 1, 2, 0, 5};
        System.out.println(Arrays.toString(maxSlidingWindow(nums, 3)));
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] res = new int[nums.length - k + 1];
        int i = 0;
        while (i < k) {
            push(list, nums[i]);
            i++;
        }
        res[0] = list.getFirst();
        for (int j = k; j < nums.length; j++) {
            pop(list, nums[j - k]);
            push(list, nums[j]);
            res[j - k + 1] = list.getFirst();
        }
        return res;
    }

    public static void push(LinkedList<Integer> list, int num) {
        if (list.isEmpty()) {
            list.push(num);
            return;
        }
        while (!list.isEmpty() && num > list.getLast()) {
            list.removeLast();
        }
        list.add(num);
    }

    public static void pop(LinkedList<Integer> list, int num) {
        if (!list.isEmpty() && list.peek() == num) list.pop();
    }

}
