package DataStrucure.recursion;

public class Print_name {
    public static void main(String[] args) {
        print_name(100);
    }

    private static void print_name(int i) {
        if (i < 0) {
            return;
        }
        System.out.println("rohan");
        print_name(i - 1);

    }
}
