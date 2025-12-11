package DataStrucure.queuse;

import java.util.*;

public class Priorityqueue2 {
    public static void main(String[] args) {
        int[] nums1={1,2,4,5,6};
        int[] nums2={3,5,7,9};

       List<List<Integer>> list= kSmallestPairs(nums1,nums2,20);
        //System.out.println(list.toString());

    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
//        Map<Integer,List<Integer>> map=new HashMap<>();
       PriorityQueue<Integer> pq=new PriorityQueue<>();
//
//        for (int i=0;i<nums1.length;i++){
//
//            for (int j=0;j<nums2.length;j++){
//                pq.add(nums1[i]+nums2[j]);
//                map.put(nums1[i]+nums2[j],Arrays.asList(nums1[i],nums2[j]));
//            }
//        }
//
//        System.out.println(map.toString());
        List<List<Integer>> list=new ArrayList<>();
//
//        for (int i=0;i<k;i++){
//           int putValue=pq.poll();
//
//           list.add(map.get(putValue));
//           map.remove(map.get(putValue));
//
//        }



     return list;


    }
}
