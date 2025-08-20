import java.util.HashSet;

public class Leetcode202 {

    public static void main(String[] args) {
        int num = 19;

        boolean value = isHappy(num);
        System.out.println(value);
    }

    static HashSet<Integer> seen = new HashSet<>();

    private static boolean isHappy(int num) {

        if (num == 1)
            return true;
        if (seen.contains(num))
            return false;

        seen.add(num);

        int ans = isSum(num);
        return isHappy(ans);
    }

    public static int isSum(int num) {

        int sum = 0;

        while (num > 0) {

            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }

}