
public class SumOfDigits {
    public static void main(String[] args) {
        int result = sumOfdigits(45634);
        System.out.println(result);

    }

    private static int sumOfdigits(int i) {
        if (i <= 1) {
            return 1;
        }

        return i % 10 * sumOfdigits(i / 10);

    }
}
