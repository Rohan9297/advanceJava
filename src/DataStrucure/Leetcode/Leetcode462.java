package DataStrucure.Leetcode;

import java.util.Arrays;

public class Leetcode462 {

    public static void main(String[] args) {
        int[] arr={1,10,2};

        int result=minMoves2(arr);
        System.out.println(result);

    }

    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);

        int median=findMediane(nums);
        System.out.println(median);
        int result=0;

        for(int i=0;i<nums.length;i++){

            result+=Math.abs(nums[i]-median);
        }


return  result;
    }

    private static int findMediane(int[] nums) {

        int median = 0;
        if (nums.length % 2 == 0) {
            median = (nums[nums.length / 2] + nums[(nums.length / 2) - 1]) / 2;
        }
        else {
            median=(nums[nums.length/2]);
        }
        return median;
    }
}
