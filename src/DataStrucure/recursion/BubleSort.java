package Leetcode.recursion;

public class BubleSort {
    public static void main(String[] args) {

        int[] nums = { 67, 34, 53, 67, 86, 12 };
        solve(nums, nums.length - 1, 0);

        for (int num : nums) {
            System.out.println(num);
        }
    }

    private static void solve(int[] nums, int rows, int colm) {

        if (rows == 0) {
            return;
        }

        if (rows > colm) {
            if (nums[colm] > nums[colm + 1]) {
                // swap
                int temp = nums[colm];
                nums[colm] = nums[colm + 1];
                nums[colm + 1] = temp;
            }
            solve(nums, rows, colm + 1);
        } else {

            solve(nums, rows - 1, 0);
        }

    }
}
