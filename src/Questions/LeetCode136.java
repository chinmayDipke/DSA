package Questions;

import java.util.Arrays;

public class LeetCode136 {

    public static void main(String[] args) {

        int[] arr = {4,1,2,1,2};
        int[] arr1 = {2,2,1};
        System.out.println(singleNumber1(arr1));


    }

    static int singleNumber(int[] nums) {

        int count = 0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){

            count = count ^ nums[i];
        }
        return count;
    }
   /* static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i += 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }*/
}
