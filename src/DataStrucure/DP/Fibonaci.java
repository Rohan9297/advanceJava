import java.util.Arrays;

public class Fibonaci {

    public static void main(String[] args) {
        int k = 5000;
        int[] dp = new int[k + 1];
        Arrays.fill(dp, -1);
        System.out.println(result(k, dp));
        System.out.println(bootomUp(k, dp));
        System.out.println(constantTime(k, dp));
    }

    private static int constantTime(int n, int[] dp) {

        if (n <= 1)
            return n;

        int a = 0;
        int b = 1;
        int c = 0;

        for (int i = 1; i < n; i++) {
            c = a + b;
            a = b;
            b = c;

        }

        return c;
    }

    private static int bootomUp(int n, int[] dp) {

        if (n <= 1)
            return n;
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }

    private static int result(int n, int[] dp) {

        if (n <= 1)
            return n;

        if (dp[n] != -1) {
            return dp[n];
        }

        return dp[n] = result(n - 1, dp) + result(n - 2, dp);
    }
}