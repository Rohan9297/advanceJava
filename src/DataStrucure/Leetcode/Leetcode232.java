package DataStrucure.Leetcode;

public class Leetcode232 {
    public static void main(String[] args) {
        int[] nums={-1,-2,-3,-4,-5};
        int k=2;
        long result= maxSubarraySum(nums,k);
        System.out.println(result);
    }

    public static long maxSubarraySum(int[] nums, int k) {
        long sum=0;

        for(int i=0;i<nums.length;i++){
            int temp_sum=0;
            for(int j=i;(j<k && j<nums.length);j++){
                temp_sum+=nums[j];
            }
            sum=Math.max(sum,Math.abs(temp_sum));
        }
        return sum;
    }
}
