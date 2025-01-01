package Questions;

public class LeetCode704 {
    public static void main(String[] args) {
        int[] arr = { -1,0,3,5,9,12 };


        System.out.println(binarysearch(arr,9));
    }
    static int search(int[] nums, int target) {

        for(int i = 0;i < nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;


        while(start <= end){

            int mid = start + (end - start) / 2;// not done (start + end) / 2 cuz (start + end) may get very large

            if(target < arr[mid]){   // search at left side of array and update end by mid - 1
                end = mid - 1;
            }
            else if (target > arr[mid]){ // search at right side of array and update start by mid + 1
                start = mid + 1;
            }
            else{  // only here answer is returened
                return mid;
            }

        }
        return -1;
    }
}
