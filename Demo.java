package OOP.Interfaece;

interface TestInterface {
    final int a = 10;

    static void display() {
        System.out.println("hello");
    }
}

class TestClass implements TestInterface {

    public void anything() {
        System.out.println("everything is ok here");
    }
}

// A class that implements the interface.
class Demo {
    // Driver Code
    public static void main(String[] args) {

        TestClass d = new TestClass();
        TestInterface.display();
        d.anything();
    }
}
