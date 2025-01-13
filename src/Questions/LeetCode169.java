package Questions;

import java.util.Arrays;

public class LeetCode169 {
    public static void main(String[] args) {

        int[] arr = {1,100,200,1,100};
        System.out.println(majorityElement(arr));


    }


    static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
