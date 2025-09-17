package DataStrucure.HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Leetcode139 {
    public static void main(String[] args) {
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>(Arrays.asList("leet", "code"));

        boolean value = wordBreak(s, wordDict);
        System.out.println(value);
    }

    public static boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set = new HashSet<>();
        for (String string : wordDict) {
            set.add(string);
        }

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        return result(set, s, dp);
    }

    public static boolean result(Set<String> set, String str, boolean[] dp) {

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && set.contains(str.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[str.length()];
    }

}
