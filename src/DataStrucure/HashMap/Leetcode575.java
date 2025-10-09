package DataStrucure.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Leetcode575 {
    public static void main(String[] args) {
        int[] candyType = { 1, 1, 2, 2, 3, 3 };
        int result = distributeCandies(candyType);
        System.out.println(result);

        ArrayList<Integer> list = new ArrayList<>();

    }

    public static int distributeCandies(int[] candyType) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : candyType) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return 0;
    }

}
