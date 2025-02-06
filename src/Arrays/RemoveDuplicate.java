package Arrays;

import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,4,4,5,5,6,6,6,6,6,6};
        System.out.println(removeDuplicate(arr));
    }



    static List<Integer> removeDuplicate(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                list.add(nums[i]);
            }
        }
        return list;
    }
    static int[] removeDuplicate(int[] nums){

    }
}
