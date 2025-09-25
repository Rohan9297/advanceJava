package OOP.Interfaece;

public class Exceptions {
    public static void main(String[] args) {

        try {
            int num = 10 / 0;
            System.out.println(num);
        } finally {
            System.out.println("finally block is executed...");
        }
    }
}
