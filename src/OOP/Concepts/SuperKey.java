package OOP.Concepts;

public class SuperKey {
    public static void main(String[] args) {
        DemoInherit d1 = new DemoInherit(1, 12, 12);
        int result=d1.addition();
        System.out.println(result);
//        d1.anything();
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

    public void anything(){

        System.out.println("doing the great work in the parent class");
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

    public int addition() {

        int sum=c+super.addition();

        return sum;
    }

    public void anything(){
        super.anything();
        System.out.println("doing the great work in the child class");
    }

}
