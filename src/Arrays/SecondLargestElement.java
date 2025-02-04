package Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,3,12,5,9};

        System.out.println(secondLargestElement(arr));

    }
    static int secondLargestElement(int[] nums){
        int largestElement = -1;

        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > largestElement ){
                largestElement = nums[i];
            }
        }
        int secondlargest = -1;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] > secondlargest && nums[i] != largestElement){
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }
}
