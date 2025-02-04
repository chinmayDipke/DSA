package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,3,12,5,9};

        System.out.println(secondLargestElement(arr));
    }
    static int secondLargestElement(int[] nums){
        int largestEle = -1;

        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > largestEle ){
                largestEle = nums[i];
            }
        }
        int secondEle = -1;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > secondEle && nums[i] != largestEle){
                secondEle = nums[i];
            }
        }
        return secondEle;
    }
}
