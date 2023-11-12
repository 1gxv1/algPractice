package hashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class t15 {
    public static void main(String[] args) {
        int[] a = new int[]{-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(a));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) continue;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[left] + nums[i] + nums[right];
                if (sum < 0) left++;
                else if (sum > 0) {
                    right--;
                } else {
                    res.add(Arrays.asList(nums[left], nums[right], nums[i]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                    left++;
                }
            }
        }
        return res;
    }
}
