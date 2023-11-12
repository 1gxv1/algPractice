package hashTable;

import java.util.Arrays;
import java.util.HashMap;

public class t383 {
    public static void main(String[] args) {
        canConstruct2("aa", "ab");
    }

    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char s = magazine.charAt(i);
            Integer sum = map.get(s);
            if (sum != null) map.replace(s, ++sum);
            else map.put(s, 1);
        }
        for (char s : ransomNote.toCharArray()) {
            Integer sum = map.get(s);
            if (sum != null && sum > 0) map.replace(s, --sum);
            else return false;
        }
        return true;
    }

    public static boolean canConstruct2(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        magazine = magazine.toLowerCase();
        ransomNote = ransomNote.toLowerCase();
        int[] sum = new int[26];
        for (int i = 0; i < magazine.length(); i++) {
            sum[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            if (--sum[ransomNote.charAt(i) - 'a'] < 0) return false;
        }
        return true;
    }

}
