package OOP.Concepts;

public class TryBlock {
    public static void main(String[] args) {
        //check wether the co
        find_ans();
    }

    public static void find_ans(){

        try{
            System.out.println("try block only");
            System.exit(-1);
        }
        finally {
            System.out.println("finally block always excepted");
        }
    }
}
