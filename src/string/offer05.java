package string;

public class offer05 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }

    public static String replaceSpace(String s) {
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') res = res + "%20";
            else res = res + s.charAt(i);
        }
        return res;
    }
}
