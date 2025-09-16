package DataStrucure.Leetcode;

import java.util.Arrays;

public class Leetcode123 {
    public static void main(String[] args) {
        String[] dictionary = { "cat", "bat", "rat" };
        String sentence = "the cattle was rattled by the battery";
        System.out.println(sentence);
        String res = result(dictionary, sentence);
        System.out.println(res);
    }

    private static String result(String[] dictionary, String sentence) {
        String[] newstr = sentence.split(" ");
        // System.out.println(Arrays.toString(newstr));
        // System.out.println(sentence);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < newstr.length; i++) {
            String temp = newstr[i];
            for (String string : dictionary) {
                if (temp.charAt(0) == string.charAt(0)) {
                    result.append(string).append(" ");
                    break;
                } else {
                    result.append(temp).append(" ");
                    break;
                }

            }
        }
        return result.toString();
    }
}
