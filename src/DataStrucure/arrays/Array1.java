package DataStrucure.arrays;

// Given two unsorted arrays of distinct elements, the task is to find all pairs from both arrays whose sum is equal to a given value X.
import java.util.Arrays;
// Examples: 
import java.util.Scanner;

// Input: arr1[] = {-1, -2, 4, -6, 5, 7}, arr2[] = {6, 3, 4, 0} , x = 8
// Output: 4 4 5 3

// Input: arr1[] = {1, 2, 4, 5, 7}, arr2[] = {5, 6, 3, 4, 8}, x = 9
// Output: 1 8 4 5 5 4

// User function Template for Java
class Solution {
    Solution() {
        super();
    }
    // public static int[] productExceptSelf(int arr[]) {

    // // code here
    // int n = arr.length;
    // int result[] = new int[n];
    // Arrays.fill(result, 1);
    // for (int i = 0; i < n; i++) {

    // for (int j = 0; j < n; j++) {

    // if (i != j) {
    // result[i] = result[i] * arr[j];
    // }
    // }

    // }

    // return result;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 10, 20, 30 };
        // // int[] res = productExceptSelf(arr);
        // for (int val : res) {
        // System.out.print(val + " ");
        // }
        Solution s = new Solution();
        System.out.println(s);
    }
}
