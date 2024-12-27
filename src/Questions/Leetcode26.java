package Questions;

public class Leetcode26 {
    public static void main(String[] args) {
        int[] arr= { 2,3,5,6,8,9,10,13 };
        System.out.println(removeDuplicates(arr));
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] nums){
        int nos = 0;
        for(int n : nums){
            nos ^= n;

        }
        return nos;
    }

    static int removeDuplicates(int[] nums) {

        int j = 1;
        for(int i=1;i<nums.length;i++){

            if(nums[j-1] != nums[i]){

                nums[j]=nums[i];

                j++;


            }
        }
        return j;
    }


}
