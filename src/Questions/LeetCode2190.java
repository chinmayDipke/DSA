package Questions;
//https://leetcode.com/problems/most-frequent-number-following-key-in-an-array/
public class LeetCode2190 {
    public static void main(String[] args) {

        int[] arr = {1,100,200,1,100};
        System.out.println(mostFrequent(arr, 1));


    }
    static int mostFrequent(int[] nums, int key) {
        int maxCount = 0;
        int result = -1;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                int target = nums[i + 1];
                int count = 0;

                for (int j = 0; j < nums.length - 1; j++) {
                    if (nums[j] == key && nums[j + 1] == target) {
                        count++;
                    }
                }

                if (count > maxCount) {
                    maxCount = count;
                    result = target;
                }
            }
        }

        return result;
    }
}
