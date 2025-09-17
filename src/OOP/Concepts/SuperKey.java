package OOP.Concepts;

public class SuperKey {
    public static void main(String[] args) {
        DemoInherit d1 = new DemoInherit(1, 12, 12);
        d1.add();
    }
}

class Demo {
    int a;
    int b;

    Demo(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int addition() {
        int sum = a + b;

        return sum;
    }

}

class DemoInherit extends Demo {
    int c;

    DemoInherit(int a, int b) {
        super(a, b);
    }

    DemoInherit(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public void add() {
        int sum = super.addition() + c;
        System.out.println(sum);

    }

}
