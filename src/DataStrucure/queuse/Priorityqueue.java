package DataStrucure.queuse;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priorityqueue {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8,1};

        int result=lastStoneWeight(arr);
        System.out.println(result);
    }

    private static int lastStoneWeight(int[] arr) {

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        for(int n:arr) pq.add(n);

        while(pq.size()>1){

            int n=pq.poll();
            int n2=pq.poll();

            if(n!=n2) pq.add(n-n2);

        }

        return pq.isEmpty()? 0 : pq.peek();

    }
}
