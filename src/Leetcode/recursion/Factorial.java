
public class Factorial {
    public static void main(String[] args) {
        int result = factorial(5);
        System.out.println(result);
    }

    private static int factorial(int num) {

        if (num == 1) {
            return 1;
        }
        return factorial(num - 1) * num;
    }
}
