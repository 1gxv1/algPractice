package array;

public class t35 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 100;
        int targetIndex = searchInsert(a, target);
        System.out.println("targetIndex:" + targetIndex);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;
        int mid = 0;
        while (left <= right) {
            mid =(left+right)/2;
            if (target == nums[mid]) {
                targetIndex = mid;
                break;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (targetIndex != -1) return targetIndex;
        if (left > mid) return left;
        else return right+1;
    }

}
