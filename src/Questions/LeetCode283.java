package Questions;

public class LeetCode283 {

    public static void main(String[] args) {
        int[] arr = { -1,0,3,5,9,12 };


        System.out.println(moveZeroes(arr));
        for (int i: arr) {
            System.out.println(i);
        }
    }



        public void moveZeroes(int[] nums) {
            int store = 0;
            for(int i = 0; i<nums.length;i++){
                if(nums[i]==0){
                    store++;

                }
                else if(store > 0){
                    int temp = nums[i];
                    nums[i] = 0;
                    nums[i-store] = temp;
                }

            }


        }


}
