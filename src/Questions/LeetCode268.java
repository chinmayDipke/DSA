package Questions;

import java.util.Arrays;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int missing = missingNumber(arr);
        int missing1 = missingNumber1(arr);
        System.out.println(missing);
    }
    static int missingNumber(int[] arr) {
        int n = arr.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }
    public static int missingNumber1(int[] arr) {
        Arrays.sort(arr);
        int i = 0;

        int index = arr[i] - 1;
        for(i = 1; i<arr.length;i++){
            if(arr[i] != arr[index]){
                return index;
            }
        }
        return -1;
    }
}
