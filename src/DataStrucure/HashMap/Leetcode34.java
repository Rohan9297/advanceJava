package DataStrucure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class Leetcode34 {
    public static void main(String[] args) {
        String ransomNote = "fihjjjjei";
        String magazine = "hjibagacbhadfaefdjaeaebgi";

        boolean val = canConstruct(ransomNote, magazine);
        System.out.println(val);

    }

    public static boolean canConstruct(String ransomNote, String magazine) {

        Map<Character, Integer> map1 = new HashMap<>();

        for (int i = 0; i < ransomNote.length(); i++) {

            map1.put(ransomNote.charAt(i), map1.getOrDefault(ransomNote.charAt(i), 0) + 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {

            map2.put(magazine.charAt(i), map2.getOrDefault(magazine.charAt(i), 0) + 1);

        }

        for (Map.Entry<Character, Integer> map : map1.entrySet()) {

            if (!map2.containsKey(map.getKey()))
                return false;

            if (map.getValue() != map2.get(map.getKey()) || map.getValue() >= map2.get(map.getKey()))
                return false;

        }

        return true;
    }
}
