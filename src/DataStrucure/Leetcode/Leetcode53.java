package DataStrucure.Leetcode;

public class Leetcode53 {
    public static void main(String[] args) {
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};

        int  result=maxSubarray(nums);
        System.out.println(result);
    }

    private static int maxSubarray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int current_sun=0;
            for (int i=0;i<nums.length;i++){
                current_sun+=nums[i];

                if(current_sun>max_sum){
                    max_sum=current_sun;
                }

                if(current_sun<0){
                    current_sun=0;
                }
            }
        return max_sum;
    }
}
