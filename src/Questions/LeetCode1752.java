package Questions;

import java.util.Arrays;

public class LeetCode1752 {
    public static void main(String[] args) {
        int[] arr= {3,4,5,1,2};
        System.out.println(check(arr));
        System.out.println(check1(arr));
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
    public static boolean check1(int[] nums) {
        int n = nums.length;

        int[] cloned = nums.clone();

        Arrays.sort(cloned);

        int k = 0;

        while (k < n) {
            int[] rotatedArray = new int[n];

            for (int i = 0; i < n; i++) {
                rotatedArray[(i + k) % n] = nums[i];
            }

            if (Arrays.equals(rotatedArray, cloned)) {
                return true;
            }

            k++;
        }
        return false;
    }
}
