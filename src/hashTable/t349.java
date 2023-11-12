package hashTable;

import java.util.ArrayList;
import java.util.HashSet;

public class t349 {
    public static void main(String[] args) {

    }

    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> res = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        for (int num : nums2) {
            if (set.contains(num)) {
                res.add(num);
            }
        }
        int[] a = new int[res.size()];
        int index = 0;
        for (int s : res) {
            a[index++] = s;
        }
        return a;
    }
}
