package Arrays;

import java.util.Arrays;

public class RotateArrayBy_K {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rotatedArray = rotate(arr, 3);
        System.out.println(Arrays.toString(rotatedArray));
    }

    static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds
        int[] newAr = new int[n];


        for (int i = 0; i < n; i++) {
            newAr[(i + k) % n] = nums[i];
        }

        return newAr;
    }
}
