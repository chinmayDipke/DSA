package Questions;

import java.util.Arrays;

public class Leet217 {
    public static void main(String[] args) {
        int[] arr = { 5, 6, 1, 3, 0 };


        System.out.println(containsDuplicate(arr));
    }

    static boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);//sort the arrray
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
