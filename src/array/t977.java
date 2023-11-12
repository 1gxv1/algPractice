package array;

import java.util.Arrays;

public class t977 {
    public static void main(String[] args) {
        int[] a = new int[]{-6, -3, -1, 0, 1, 5, 6, 8, 9};
        System.out.println(Arrays.toString(sortedSquares(a)));
    }

    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;
    }

}
