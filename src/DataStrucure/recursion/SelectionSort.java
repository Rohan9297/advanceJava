import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = { 67, 34, 53, 67, 86, 12 };
        solve(nums, nums.length, 0, 0);
        System.out.println(Arrays.toString(nums));
    }

    private static void solve(int[] nums, int row, int col, int max) {

        if (row == 0) {
            return;
        }

        if (col < row) {

            if (nums[col] > nums[max]) {
                solve(nums, row, col + 1, col);
            } else {
                solve(nums, row, col + 1, max);
            }

        } else {
            int temp = nums[max];
            nums[max] = nums[row - 1];
            nums[row - 1] = temp;
            solve(nums, row - 1, 0, 0);
        }

    }
}
