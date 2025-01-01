package Questions;

import java.util.Arrays;

public class LeetCode268 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 3, 0 };


        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
    }


        static int missingNumber(int[] arr) {
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
