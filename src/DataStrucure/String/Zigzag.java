package Leetcode.String;

public class Zigzag {
    public static void main(String[] args) {
        String s1 = "PAYPALISHIRING";
        System.out.println(s1.contains("PAY"));
        int k = 10;

        // printZigzag(s1,k);

        String s = "dog cat cat dog";

        char[] ch = s.toCharArray();
        System.out.println(ch[0]);
        String str = Integer.toString(k);
        System.out.println(str);
        StringBuilder str1 = new StringBuilder();

    }

    private static void printZigzag(String s1, int k) {

        for (int i = 0; i < k; i++) {
            System.out.println(s1.charAt(i));
            for (int j = k; j <= 0; j--) {

            }
        }
    }
}
