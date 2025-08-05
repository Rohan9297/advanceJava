package DataStrucure.recursion;

public class Steps {
    public static void main(String[] args) {
        int result = numberOfSteps(66);
        System.out.println(result);
    }

    public static int numberOfSteps(int num) {

        return helper(num, 0);
    }

    private static int helper(int num, int steps) {
        if (num == 0) {
            return steps;
        }

        if (num % 2 != 0) {

            return helper(num - 1 / 2, steps + 1);
        }

        return helper(num / 2, steps + 1);
    }
}
