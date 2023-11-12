package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class t18 {
    public static void main(String[] args) {
        List s = fourSum(new int[]{1, -2, -5, -4, -3, 3, 3, 5}, -11);
        for (int i = 0; i < s.size(); i++) {
            System.out.println(s.get(i));
        }
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target && target > 0) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] > target && target > 0) break;
                int left = j + 1;
                int right = nums.length - 1;
                while (left < right) {
                    if (j > i + 1 && nums[j] == nums[j - 1]) break;
                    long sum = (long) nums[left] + nums[right] + nums[i] + nums[j];
//                    处理重复元素
                    if (sum > target) right--;
                    else if (sum < target) left++;
                    else {
                        List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        res.add(list);
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
