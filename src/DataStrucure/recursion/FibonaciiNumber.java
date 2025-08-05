package DataStrucure.recursion;

public class FibonaciiNumber {

    public static void main(String[] args) {

        int reslut = fibonaci(100);
        System.out.println(reslut);
    }

    static int fibonaci(int num) {
        if (num < 2) {
            return num;
        }

        return fibonaci(num - 1) + fibonaci(num - 2);
    }
}
