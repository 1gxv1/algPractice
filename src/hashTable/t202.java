package hashTable;

import java.util.HashMap;
import java.util.HashSet;

public class t202 {
    public static void main(String[] args) {

    }

    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            n = getNextNum(n);
        }
        return n == 1;
    }

    public static int getNextNum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += (int) Math.pow(r, 2);
            n /= 10;
        }
        return sum;
    }
}
