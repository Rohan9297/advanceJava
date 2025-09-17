package Leetcode.recursion;

public class PrintNumber {
    public static void main(String[] args) {
        numbers(10);

    }

    private static void numbers(int i) {
        if (i <= 1) {
            return;
        }
        System.out.println(i);
        numbers(i - 1);
        System.out.println(i);

    }
}
