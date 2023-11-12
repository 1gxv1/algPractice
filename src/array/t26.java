package array;

import java.util.Arrays;

public class t26 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 1, 1, 2, 3, 4, 5};
        int len = removeDuplicates(a);
        System.out.println(Arrays.toString(a));
        System.out.println(len);
    }

    public static int removeDuplicates(int[] nums) {
        int interval = 0;
        for (int k = 0; k < nums.length - 1; k++) {
            int m = k + 1;
            if (nums[k] == nums[m]) interval++;
            else nums[m - interval] = nums[m];
        }
        return nums.length - interval;
    }
}
