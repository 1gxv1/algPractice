package hashTable;

import java.util.HashMap;
import java.util.LinkedList;

public class t1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 34};
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, LinkedList> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                LinkedList<Integer> list = new LinkedList<Integer>();
                list.add(i);
                map.put(nums[i], list);
            } else {
                LinkedList<Integer> list = map.get(nums[i]);
                list.add(i);
            }
        }
        for (int j : map.keySet()) {
            if (map.get(target - j) != null) {
                if (j == target - j && map.get(j).size() == 1) continue;
                if (j == target - j) return new int[]{(int) map.get(j).get(0), (int) map.get(target - j).get(1)};
                return new int[]{(int) map.get(j).get(0), (int) map.get(target - j).get(0)};
            }
        }
        return null;
    }
}
