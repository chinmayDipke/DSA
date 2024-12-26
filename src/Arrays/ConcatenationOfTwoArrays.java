package Arrays;

import java.util.Arrays;

public class ConcatenationOfTwoArrays {
    public static void main(String[] args) {
        int[] arr= { 1,2,1 };



        System.out.println(Arrays.toString(getConcatenation(arr)));
    }

    static int[] getConcatenation(int[] nums) {
        //int len = nums.length;
        int[] ans = new int[nums.length*2];
        for(int i = 0; i < nums.length; i++){

            ans[i] = nums[i];
            ans[i + nums.length] = ans[i];

        }
        return ans;
    }

}


