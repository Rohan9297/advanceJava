package DataStrucure.HashMap;

import java.util.*;

public class Leetcode3005 {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 };
        int count = maxFrequencyElements(nums);
        System.out.println(count);
    }

    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxFrequency = Integer.MIN_VALUE;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            maxFrequency = Math.max(maxFrequency, map.get(num));
        }
        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() == maxFrequency) {
                sum += entry.getValue();
            }
        }

        // System.out.println(maxFrequency);
        return sum;
    }

}