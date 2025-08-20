
public class Recursioncopy {
  public static void main(String[] args) {
    // write a function that can print from 1 to n;
    print1(1);
  }

  private static void print1(int i) {
    if (i == 5) {
      System.out.println(i);
      return;
    }
    System.out.println(i);
    print1(i + 1);
  }

  // why recursion:- how to study s=actually study recursion
  // is helps us in solving biggeer complex problem in simpler way
  // recursion is actually function calling
  // you can convert the recusion function into iteration
  // vice versa;

  // space complexity

}
