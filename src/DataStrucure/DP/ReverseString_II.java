package DataStrucure.DP;

public class ReverseString_II {
    public static String reverseStr(String s, int k) {
        return solve(s, k, 0, true);
    }

    public static String solve(String s, int k, int id, boolean flag) {

        if (id >= s.length()) {
            return "";
        }

        int end = Math.min(id + k, s.length());
        String part = s.substring(id, end);

        if (flag) {

            part = new StringBuilder(part).reverse().toString();
        }

        return part + solve(s, k, end, !flag);
    }

    public static void main(String[] args) {
        String str = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(str, k));
        ;
    }
}
