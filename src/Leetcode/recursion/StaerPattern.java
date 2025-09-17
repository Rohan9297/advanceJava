package Leetcode.recursion;

public class StaerPattern {

    public static void main(String[] args) {

        solve(4, 0);
    }

    public static void solve(int row, int clm) {

        if (row == 0) {
            return;
        }
        if (clm < row) {
            System.out.print("*");
            solve(row, clm + 1);
        } else {
            System.out.println();
            solve(row - 1, 0);
        }

    }
}