package Leetcode.String;

public class Sb {

    public static void main(String[] args) {
        String s = "a#b%*";
        processStr(s);
        // System.out.println(s1);
    }

    public static void processStr(String s) {
        char[] c = s.toCharArray();
        System.out.println(c);

        // StringBuilder str = new StringBuilder(s);

        // for (int i = 0; i < str.length(); i++) {

        // if (str.charAt(i) == '#') {
        // StringBuilder append = new StringBuilder(str.substring(0, str.length() - 1));
        // str.append(append);
        // } else if (str.charAt(i) == '*') {
        // str.deleteCharAt(str.length() - 1);
        // } else if (str.charAt(i) == '%') {
        // str.reverse();
        // } else {
        // str.append(str.charAt(i));
        // }
        // }

        // return s.toString();
    }
}
