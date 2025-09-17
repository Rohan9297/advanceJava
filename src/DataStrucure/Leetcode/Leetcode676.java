package DataStrucure.Leetcode;

import java.util.*;
import java.util.Map.Entry;

public class Leetcode676 {
    public static void main(String[] args) {

    }
}

class MagicDictionary {
    Map<String, Integer> map;

    public MagicDictionary() {
        map = new HashMap<>();
    }

    public void buildDict(String[] dictionary) {

        for (String str : dictionary) {
            map.put(str, str.length());
        }
    }

    public boolean search(String searchWord) {

        for (Map.Entry<String, Integer> str : map.entrySet()) {

            if (str.getKey().length() != searchWord.length())
                continue;
            int dif = 0;
            for (int i = 0; i < str.getKey().length(); i++) {
                if (str.getKey().charAt(i) != searchWord.charAt(i)) {
                    dif++;
                    if (dif > 1) {
                        break;
                    }
                }
            }

            if (dif == 1) {
                return true;
            }

        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dictionary);
 * boolean param_2 = obj.search(searchWord);
 */
