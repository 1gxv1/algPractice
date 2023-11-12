package hashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class t454 {


    public static void main(String[] args) {

    }

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map m1 = calculateTwoSum(nums1, nums2);
        Map m2 = calculateTwoSum(nums3, nums4);
        int res = 0;
        for (Object key : m1.keySet()) {
            if (m2.get(-(int) key) != null) {
                List<int[]> l1 = (List<int[]>) m2.get(-(int) key);
                List<int[]> l2 = (List<int[]>) m1.get(key);
                res = res + l1.size()*l2.size();
            }
        }
        return res;
    }

    public static Map<Integer, List<int[]>> calculateTwoSum(int[] nums1, int[] nums2) {
        HashMap<Integer, List<int[]>> map = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                int sum = nums1[i] + nums2[j];
                List<int[]> list = map.get(sum);
                if (list == null) {
                    List<int[]> index = new ArrayList<>();
                    index.add(new int[]{i, j});
                    map.put(sum, index);
                } else {
                    list.add(new int[]{i, j});
                }
            }
        }
        return map;
    }
}
