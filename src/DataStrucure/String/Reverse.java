package Leetcode.String;

public class Reverse {
    public static void main(String[] args) {
        String str = "rohan";
        System.out.println(reverse(str));

    }

    private static String reverse(String str) {

        int right = str.length() - 1;
        StringBuilder s = new StringBuilder();

        for (int i = right; i >= 0; i--) {
            s.append(str.charAt(i));
        }

        return s.toString();
    }
}
