public class Remove_A {

    public static void main(String[] args) {
        String A = "baaccad";

        // System.out.println(solve2(A));
        solve("", A);
    }

    public static String solve(String str, String ans, int pointer) {

        if (pointer == str.length()) {
            return "";
        }

        if (str.charAt(pointer) == 'a') {
            solve(str, ans, pointer + 1);
        } else {
            ans += str.charAt(pointer);
            solve(str, ans, pointer + 1);
        }
        return ans;

    }

    public static String solve2(String str) {

        if (str.isEmpty()) {
            return "";
        }
        char ch = str.charAt(0);

        if (ch == 'a') {
            return "" + solve2(str.substring(1));
        } else {

            return ch + solve2(str.substring(1));
        }

    }

    public static void solve(String p, String o) {

        if (o.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = o.charAt(0);

        if (ch == 'a') {
            solve(p, o.substring(1));
        } else {
            solve(p + ch, o.substring(1));
        }
    }
}
