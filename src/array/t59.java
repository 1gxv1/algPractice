package array;

import java.util.Arrays;

public class t59 {
    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(generateMatrix(5)));
    }

    public static int[][] generateMatrix(int n) {
        int count = 1;
        int offset = 1;
        int startX = 0;
        int startY = 0;
        int circleSum = 0;
        int i, j;
        int[][] res = new int[n][n];
        while (circleSum < n / 2) {
            for (j = startY; j < n - offset; j++) {
                res[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                res[i][j] = count++;
            }
            for (; j >= offset; j--) {
                res[i][j] = count++;
            }
            for (; i >= offset; i--) {
                res[i][j] = count++;
            }
            circleSum++;
            offset++;
            startY++;
            startX++;
        }
        if (n % 2 == 1) res[startX][startY] = (int) Math.pow(n, 2);
        return res;
    }
}
