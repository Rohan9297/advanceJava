package DataStrucure.HashMap;

import java.util.*;

public class Leetcode697 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 1 };
        int len = maximum(arr);
        System.out.println(len);

    }

    public static int findShortestSubArray(int[] nums) {

        int len = nums.length - 1;

        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            if (!first.containsKey(num))
                first.put(num, i);
            last.put(num, i);

        }

        int degree = Collections.max(map.values());

        for (int key : map.keySet()) {

            if (map.get(key) == degree) {

                int temp = Math.min(len, last.get(key) - first.get(key) + 1);
                len = Math.min(len, temp);
            }
        }

        return len;

    }

    private static int maximum(int[] arr) {

        return findShortestSubArray(arr);

    }

}
