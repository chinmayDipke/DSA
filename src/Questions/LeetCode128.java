package Questions;

import java.util.Arrays;

public class LeetCode128 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(arr));
    }

    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1, cnt = 1;
        int lastNumber = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - 1 == lastNumber) {
                cnt += 1;
                lastNumber = nums[i];
            } else if (nums[i] != lastNumber) {
                cnt = 1;
                lastNumber = nums[i];
            }
            longest = Math.max(longest, cnt);
        }
        return longest;
    }
}
