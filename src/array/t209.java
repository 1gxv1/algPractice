package array;

public class t209 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 20;
        System.out.println(minSubArrayLen(target, a));
    }

    //    public static int minSubArrayLen(int target, int[] nums) {
//        int sums = 0;
//        for (int num : nums) {
//            sums += num;
//        }
//        if (sums < target) return 0;
//        int left = 0;
//        int right = nums.length - 1;
//        while (left <= right) {
//            int sum = 0;
//            for (int i = left; i <= right; i++) {
//                sum += nums[i];
//            }
//            if (sum >= target) {
//                if (right - left == 0) return 1;
//                int l = nums[left] <= nums[right] ? left++ : right--;
//            } else {
//                return right - left + 2;
//            }
//        }
//        return right;
//    }
    public static int minSubArrayLen(int target, int[] nums) {
        double result = Double.POSITIVE_INFINITY;
        int sum = 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            while (sum >= target) {
//                找到符合条件的子数组，开始滑动窗口
                int len = i - j + 1;
                result = Math.min(result, len);
                sum -= nums[j];
                j++;
            }
        }
        if (result > nums.length) return 0;
        return (int) result;
    }
}
