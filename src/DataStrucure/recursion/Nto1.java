package Leetcode.recursion;

public class Nto1 {
    public static void main(String[] args) {
        fun(5);
    }

    public static void fun(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }

        fun(n - 1);
        System.out.println(n);

    }

}
