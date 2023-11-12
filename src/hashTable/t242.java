package hashTable;

import java.util.Arrays;

public class t242 {
    public static void main(String[] args) {

    }

    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        int[] sum = new int[26];
        for (char c : cs) {
            sum[c - 'a']++;
        }
        for (char c : ct) {
            sum[c - 'a']--;
        }
        for (int element : sum) {
            if (element != 0) return false;
        }
        return true;
    }


}
