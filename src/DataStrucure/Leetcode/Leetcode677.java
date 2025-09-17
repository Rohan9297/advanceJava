package DataStrucure.Leetcode;

import java.util.*;

public class Leetcode677 {
    public static void main(String[] args) {

    }
}

class MapSum {
    Map<String, Integer> map;

    public MapSum() {
        map = new HashMap<>();
    }

    public void insert(String key, int val) {
        map.put(key, val);
    }

    public int sum(String prefix) {
        boolean isTrue = false;
        for (Map.Entry<String, Integer> str : map.entrySet()) {

            for (int i = 0; i < prefix.length(); i++) {

                if (prefix.charAt(i) != str.getKey().charAt(i)) {
                    isTrue = true;
                    break;
                } else {
                    isTrue = false;
                }

            }

            if (!isTrue) {

                return str.getValue();
            }
        }
        return 0;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
