package Leetcode.arrays;

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };

        ArrayList<Integer> list = subarraySum(arr, 12);
        System.out.println(list);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int target) {

        // code here
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {

                sum += arr[j];

                if (sum == target) {

                    list.add(i + 1);
                    list.add(j + 1);

                    return list;
                }

                else if (sum > target) {

                    break;
                } else {

                    continue;

                }
            }

            if (list.isEmpty()) {
                list.add(-1);
            }

        }
        return list;
    }
}
