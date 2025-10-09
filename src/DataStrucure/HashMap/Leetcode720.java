package DataStrucure.HashMap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Leetcode720 {
    public static void main(String[] args) {
        SolutionJava s = new SolutionJava();
        String[] words = { "w", "wo", "wor", "worl", "world" };
        String str = s.longestWord(words);
        System.out.println(str);
    }
}

class SolutionJava {

    public String longestWord(String[] words) {

        Arrays.sort(words);
        Arrays.sort(words, (a, b) -> a.length() - b.length());

        String str = "";
        Set<String> set = new HashSet<>();
        for (String st : words) {

            if (st.length() == 1 || set.contains(st.substring(0, st.length() - 1))) {
                set.add(st);

                if (st.length() == str.length() && st.compareTo(str) < 0 || st.length() > str.length()) {
                    str = st;
                }
            }

        }
        return str;

    }
}