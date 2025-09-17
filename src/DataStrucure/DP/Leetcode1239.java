
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// You are given an array of strings arr. A string s is formed by the concatenation of a subsequence of arr that has unique characters.

// Return the maximum possible length of s.

// A subsequence is an array that can be derived from another array by deleting some or no elements without changing the order of the remaining elements.

// Example 1:

// Input: arr = ["un","iq","ue"]
// Output: 4
// Explanation: All the valid concatenations are:
// - ""
// - "un"
// - "iq"
// - "ue"
// - "uniq" ("un" + "iq")
// - "ique" ("iq" + "ue")
// Maximum length is 4.
public class Leetcode1239 {
    public static int[][] matrix;

    public static void main(String[] args) {

        List<String> arr = Arrays.asList("un", "iq", "ue");
        int len = maxLength(arr);
        System.out.println("length is :" + len);
    }

    public static int maxLength(List<String> arr) {

        String temp = "";
        int n = arr.size();
        return solve(arr, temp, n, 0);
    }

    public static int solve(List<String> arr, String temp, int length, int i) {

        if (i >= arr.size()) {
            return temp.length();

        }

        int include = 0;
        int exclude = 0;

        if (hasUnique(temp, arr.get(i))) {
            exclude = solve(arr, temp, length, i + 1);
        } else {
            exclude = solve(arr, temp, length, i + 1);

            include = solve(arr, temp + arr.get(i), length, i + 1);
        }

        return Math.max(include, exclude);
    }

    public static boolean hasUnique(String str1, String str2) {
        boolean[] seen = new boolean[26];

        for (char c : str1.toCharArray()) {
            if (seen[c - 'a']) {
                return true;
            }
            seen[c - 'a'] = true;
        }

        for (char c : str2.toCharArray()) {
            if (seen[c - 'a']) {
                return true;
            }
        }

        return false;
    }

}
