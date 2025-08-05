package DataStrucure.recursion;

public class Reverse {
    public static void main(String[] args) {
        int no = reverse(67890);
        System.out.println(no);
    }

    private static int reverse(int i) {
        if (i <= 10) {
            return i;
        }
        int remainder = i % 10;
        i = i / 10;
        System.out.print(remainder);
        return reverse(i);

    }
}
