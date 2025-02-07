package Arrays;

import java.util.Arrays;

public class RotateArrayByK {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] rightRotatedArray = rightRotate(arr, 2);
        int[] leftRotatedArray = leftRotate(arr, 2);

        System.out.println(Arrays.toString(rightRotatedArray));
        System.out.println(Arrays.toString(leftRotatedArray));
    }

    // Method to rotate an array to the left by k positions (previously rightRotate)
    static int[] leftRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[i] = nums[(i + k) % n]; // Previously right rotation logic
        }

        return rotatedArray;
    }

    // Method to rotate an array to the right by k positions (previously leftRotate)
    static int[] rightRotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n; // Ensure k is within bounds
        int[] rotatedArray = new int[n];

        for (int i = 0; i < n; i++) {
            rotatedArray[(i + k) % n] = nums[i]; // Previously left rotation logic
        }

        return rotatedArray;
    }
}
