package DataStrucure.stack;

import java.util.Stack;

public class DailTemperature {
    public static void main(String[] args) {
       int[] temperatures = {73,74,75,71,69,72,76,73};

       int[] result=dailyTemperatures(temperatures);
        for(int num:result){
            System.out.print(num+" ");
        }
    }

    public  static  int[] dailyTemperatures(int[] temperatures) {

   int n=temperatures.length;
   Stack<Integer> stack=new Stack<>();
   int[] res = new int[n];


        for(int i=0;i<temperatures.length;i++) {
//            int temp=temperatures[i];
//            for(int j=i+1;j<temperatures.length;j++){
//
//                if(temp<temperatures[j]){
//                    temperatures[i]=j-i;
//                    break;
//                }
//                else{
//                    temperatures[i]=0;
//                }
//
//            }

            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                        int prevIndex=stack.pop();
                        res[prevIndex]=i-prevIndex;

            }
            stack.push(i);
        }

        return res;
    }
}
