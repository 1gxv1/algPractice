package stackQueue;

import java.util.*;

public class t347 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 2, 3};
        topKFrequent(a, 2);
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
//        实现升序
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((p1, p2) -> p1[1] - p2[1]);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (priorityQueue.size() < k) {
                priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
            } else {
                if (entry.getValue() > priorityQueue.peek()[1]) {
                    priorityQueue.poll();
                    priorityQueue.add(new int[]{entry.getKey(), entry.getValue()});
                }
            }
        }
        int[] ans = new int[k];
        for (int i = k - 1; i > 0; i--) {
            ans[i] = priorityQueue.poll()[0];
        }
        return ans;
    }
}

