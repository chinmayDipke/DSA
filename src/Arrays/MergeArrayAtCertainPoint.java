package Arrays;

import java.sql.PreparedStatement;
import java.util.Arrays;

public class MergeArrayAtCertainPoint {
    public static void main(String[] args) {
        int[] arr= { 2,5,1,3,4,7 }; // [2,3,5,4,1,7]
        int target = 3;
        System.out.println(Arrays.toString(merge(arr,target)));
    }

    static int[] merge(int[] nums,int n) {

       // int start = 0;
      //  int end = nums.length;

        int[] ans = new int[n*2];

        int target =n;
        for(int i = 0; i < target; i++){

            ans[2 * i] = nums[i];
            ans[2 * i + 1] = nums[n + i];
        }

       /* for(int i = 1; i < end; i++){
            //int[] arr= { 2,5,1,3,4,7 };  [2,3,5,4,1,7]

            if(nums[i] % 2 == 0){
                temp = nums[i];
                nums[i]=nums[mid];;
            }
            else{
                nums[i]=temp;

            } */
        return ans;
        }



    }

