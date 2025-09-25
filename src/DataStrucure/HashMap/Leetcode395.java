package DataStrucure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Leetcode395 {
    public static void main(String[] args) {
        String s = "ababacb";
        int k = 3;
        int val = longestSubstring(s, k);
        System.out.println(val);
    }

    public static int longestSubstring(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int len = 0;
        String str = "";
        for (char cha : s.toCharArray()) {
            map.put(cha, map.getOrDefault(cha, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {

            if (map.get(s.charAt(i)) >= k) {
                str += s.charAt(i);
                // map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
            }

            else {
                str = "";
            }

            len = Math.max(len, str.length());

        }

        return len;
    }
}
