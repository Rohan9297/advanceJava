package DataStrucure.String;

import java.util.Arrays;

public class Assci {

    public static void main(String[] args) {
        String word = "aaAbcBC";

        char[] ch = word.toCharArray();
        Arrays.sort(ch);
        System.out.println(ch);

        System.out.println(word.charAt(0));
        System.out.println('A' - 1);
        System.out.println('Z' - 0);

    }
}