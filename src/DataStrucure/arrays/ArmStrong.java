package advanceJava.src.DataStrucure.arrays;

public class ArmStrong {

    public static void main(String[] args) {
        boolean value = isArmstrong(9474);
        System.out.println(value);
    }

    private static boolean isArmstrong(int nums) {

        int result = 0;
        int originalNum = nums;
        int digit = String.valueOf(nums).length();
        int digits = 0;

        while (nums > 0) {

            digits = nums % 10;
            result += Math.pow(digits, digit);
            nums = nums / 10;

        }

        if (result == originalNum) {
            return true;
        }
        return false;
    }
}
