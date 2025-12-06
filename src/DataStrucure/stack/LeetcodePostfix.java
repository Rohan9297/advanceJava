package DataStrucure.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetcodePostfix {

    public static void main(String[] args) {
        String[] tokens={"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result=evalRPN( tokens);
        System.out.println(result);
    }

    private static int evalRPN(String[] tokens) {

        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < tokens.length; i++) {

            if(tokens[i].equals("+")|| tokens[i].equals("-")||tokens[i].equals("*")||tokens[i].equals("/")){
                int b=stack.pop();
                int a=stack.pop();


                switch (tokens[i]){

                    case "+":
                        stack.push(a+b);
                        break;
                    case "-":
                        stack.push(a-b);
                        break;
                    case"*":
                        stack.push(a*b);
                        break;
                    case "/":
                        stack.push(a/b);
                        break;
                }
            }

            else{
                 stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }


}
