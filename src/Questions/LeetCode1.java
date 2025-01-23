package Questions;

import java.util.Arrays;

public class LeetCode1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }
    static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] temp = new int[2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0]=i;
                    temp[1]=j;
                }
            }
        }
        return temp;
    }
}
