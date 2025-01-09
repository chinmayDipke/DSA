package Arrays;

import java.util.Arrays;

public class LeetCode1480 {
    public static void main(String[] args) {
        int[] arr= { 1,2,3,4 };

        System.out.println(Arrays.toString(getSum(arr)));
    }


    static int[] getSum(int[] nums) {
        int len= nums.length;
        for(int i = 1; i < len; i++){
           nums[i]= nums[i-1]+nums[i];
        }

        return nums;
    }
}
