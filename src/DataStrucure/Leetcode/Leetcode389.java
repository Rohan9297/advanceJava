package DataStrucure.Leetcode;

import java.util.Arrays;

public class Leetcode389 {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char re = result(s, t);
        System.out.println(re);
    }

    private static char result(String s, String t) {

        // StringBuilder first=new StringBuilder(s);
        // StringBuilder second=new StringBuilder(t);
        char[] firstArray = s.toCharArray();
        char[] secondArray = t.toCharArray();

        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        int outerPointer = 0;
        for (int i = 0; i < firstArray.length; i++) {

            if (firstArray[i] != secondArray[i]) {
                return secondArray[i];
            }
            outerPointer++;
        }

        return secondArray[outerPointer];
    }
}
