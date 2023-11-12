package array;

import java.util.Arrays;

public class t34 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 3, 5, 6,7,9,10};
        System.out.println(Arrays.toString(searchRange(a, 11)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int left = searchLeftBound(nums, target);
        int right = searchRightBound(nums, target);
        if (left>right) return new int[]{-1, -1};
        else return new int[]{left, right};
    }

    public static int searchLeftBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static int searchRightBound(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else right = mid - 1;
        }
        return right;
    }
}
