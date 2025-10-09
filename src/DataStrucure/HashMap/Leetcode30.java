package DataStrucure.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode30 {
    public static void main(String[] args) {
        String str = "barfoofoobarthefoobarman";
        String[] words = { "bar", "foo", "the" };
        System.out.println(Arrays.asList(words).getClass());
        System.out.println(findSubstring(str, words).toString());

    }

    public static List<Integer> findSubstring(String s, String[] words) {

        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        int word_length = words[0].length();
        int total_length = word_length * words.length;

        for (int i = 0; i <= s.length() - total_length; i++) {
            if (helperMethod(s.substring(i, i + total_length), map, word_length)) {
                list.add(i);
            }
        }

        return list;
    }

    public static boolean helperMethod(String s, Map<String, Integer> map2, int len) {
        Map<String, Integer> map = new HashMap<>(map2);

        for (int i = 0; i < s.length(); i += len) {
            String sub = s.substring(i, i + len);

            if (map.containsKey(sub)) {
                map.put(sub, map.get(sub) - 1);
                if (map.get(sub) == 0) {
                    map.remove(sub);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

}
