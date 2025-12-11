package DataStrucure.queuse;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Check
{
    public static void main(String[] args) {
        int[] students={1,1,0,0};
        int[] sandwich={0,1,0,1};


       System.out.println(totalStudents(students,sandwich));
    }

    private static int totalStudents(int[] students, int[] sandwich) {
        Queue<Integer> queue=new ArrayDeque<>();
        Queue<Integer> stack=new ArrayDeque<>();
            for(int i=0;i<students.length;i++){
                queue.add(students[i]);
                stack.add(sandwich[i]);
            }

            while(!queue.isEmpty()){

                if(queue.peek()==stack.peek()){
                    queue.remove();
                    stack.remove();
                }
                else {
                    queue.add(queue.remove());
                }
            }
        return  queue.size();
    }
}
