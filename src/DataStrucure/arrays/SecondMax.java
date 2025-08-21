package Leetcode.arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 5, 3, 11, 45, 67, 4 };

        int result = secondMax(arr);
        System.out.println(result);
    }

    private static int secondMax(int[] arr) {
        int second_max = Integer.MIN_VALUE;
        int first_max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (first_max < num) {
                second_max = first_max;
                first_max = num;
            }
        }
        return second_max;

    }
}
