package Questions;

public class LeetCode1752 {
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};
        System.out.println(check(arr));
    }
    public static boolean check(int[] nums) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }

            if (count > 1)
                return false;
        }
        return true;
    }
}
