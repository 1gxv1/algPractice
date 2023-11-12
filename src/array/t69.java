package array;

public class t69 {
    public static void main(String[] args) {
        System.out.println(mySqrt(3));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid * mid == x || (mid + 1) * (mid + 1) > x && mid * mid < x) return mid;
            else if (mid * mid < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return 0;
    }
}
