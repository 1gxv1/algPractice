package string;

public class t541 {
    public static void main(String[] args) {

    }

    public String reverseStr(String s, int k) {
        int count = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            count++;
            if (count == 2 * k) {
                reverseInPos(cs, i - count + 1, i - k);
                count = 0;
            }
        }
        int r = cs.length % (2 * k);
        if (r < k && r > 0) reverseInPos(cs, cs.length - r, cs.length - 1);
        else if ((r > k || r == k) && r < 2 * k) {
            reverseInPos(cs, cs.length - r, cs.length - r + k - 1);
        }
        return new String(cs);
    }

    public void reverseInPos(char[] s, int left, int right) {
        while (left < right) {
            char c = s[left];
            s[left] = s[right];
            s[right] = c;
            left++;
            right--;
        }
    }

}
