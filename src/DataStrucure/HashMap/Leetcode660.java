package DataStrucure.HashMap;

import java.util.*;

public class Leetcode660 {
    public static void main(String[] args) {
        int[] nums={1,2,3,3,4,4,5};
        System.out.println(isPossible(nums));
    }

    public static boolean isPossible(int[] nums) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2=new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(list1.contains(nums[i])){
                list2.add(nums[i]);
            }
            else{
                list1.add(nums[i]);
            }
        }

        if(list1.size()>=3 && list2.size()>=3){
            return true;
        }

        return false;
    }
}
