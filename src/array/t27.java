package array;

public class t27 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 4, 3, 2, 1,};
        int len = removeElement(a, 2);
        System.out.println("len:" + len);
        for (int i = 0; i < len; i++) {
            System.out.println(a[i]);
        }
    }

    public static int removeElement(int[] nums, int val) {
        int left = 0;
        int right = nums.length - 1;
        int len = nums.length;
        while (left <=right) {
            if (nums[left] == val && nums[right] != val) {
                nums[left] = nums[right];
                left++;
                right--;
                len--;
            } else if (nums[right] == val && nums[left] != val) {
                left++;
                right--;
                len--;
            } else if (nums[left] == val && nums[right] == val) {
                len--;
                right--;
            } else {
                left++;
            }
        }
        return len;
    }
}
