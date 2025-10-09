package DataStrucure.DP;

import java.util.Arrays;

public class Climbing_stairs {
    public static void main(String[] args) {
        int stairs = 44;
        int[] dp = new int[stairs + 1];
        Arrays.fill(dp, -1);
        System.out.println(result(stairs, 0, dp));
    }

    private static int result(int stairs, int count, int[] dp) {

        if (count == stairs) {
            return 1;
        }
        if (count > stairs) {
            return 0;
        }

        if (dp[count] != -1) {
            return dp[count];
        }

        return dp[count] = result(stairs, count + 1, dp) + result(stairs, count + 2, dp);

    }
}
