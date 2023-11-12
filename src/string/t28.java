package string;

public class t28 {
    public static void main(String[] args) {

    }

    public int strStr(String haystack, String needle) {
        int[] next = resolveNextArr(needle);
        int j = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(j)) j++;
            else {
                while (j > 0 && needle.charAt(j) != haystack.charAt(i)) {
                    j = next[j];
                }
            }

        }
        return 0;
    }

    public int[] resolveNextArr(String s) {
        char[] cs = s.toCharArray();
        int[] next = new int[s.length()];
        next[0] = 0;
        int j = 0;
        for (int i = 1; i < next.length; i++) {
            while (j > 0 && cs[i] != cs[j]) {
                j = next[j - 1];
            }
            if (cs[i] == cs[j]) j++;
            next[i] = j;
        }
        return next;
    }
}
