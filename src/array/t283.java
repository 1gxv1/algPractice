package array;

import java.util.Arrays;

public class t283 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 3, 4, 5, 61, 0, 0, 43, 0, 0, 0, 0, 0};
        moveZeroes(a);
        System.out.println(Arrays.toString(a));

    }

    public static void moveZeroes(int[] nums) {
//     删除数组中的0的元素(将他们放到末尾),快慢指针
        int interval = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) interval++;
            else if (interval > 0) {
                nums[i - interval] = nums[i];
                nums[i] = 0;
            }
        }
    }
}
