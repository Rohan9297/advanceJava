package DataStrucure.HashMap;

import java.util.HashMap;
import java.util.Map;

public class LeetocodeRandom {
    public static void main(String[] args) {
        String s = "abbccddde";

        System.out.println(result(s));
    }

    private static int result(String s) {
        int max_even = Integer.MIN_VALUE;
        int low_odd = Integer.MAX_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            char ch = entry.getKey();
            int num = entry.getValue();

            if (num % 2 == 0 && num > max_even) {
                max_even = num;
            }

            if (num % 2 != 0 && num < low_odd) {
                low_odd = num;
            }

        }

        return Math.abs(max_even - low_odd);

    }
}
