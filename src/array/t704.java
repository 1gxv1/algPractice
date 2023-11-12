package array;

public class t704 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 100;
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int targetIndex = -1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (target < nums[mid]) {
//              当前的值比要找的大
                right = mid - 1;
            } else if (target > nums[mid]) {
//                当前要的值比要找的小
                left = mid + 1;
            } else {
                targetIndex = mid;
                break;
            }
        }
        return targetIndex;
    }
}
