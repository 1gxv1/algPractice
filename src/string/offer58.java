package string;

public class offer58 {
    public static void main(String[] args) {

    }

    public String reverseLeftWords(String s, int n) {
        char[] cs = s.toCharArray();
        reverseWords(cs, 0, cs.length - 1);
        reverseWords(cs, 0, cs.length - 1 - n);
        reverseWords(cs, cs.length - n, cs.length - 1);
        return new String(cs);
    }

    public void reverseWords(char[] cs, int left, int right) {
        while (left < right) {
            char c = cs[left];
            cs[left] = cs[right];
            cs[right] = c;
            left++;
            right--;
        }
    }
}
