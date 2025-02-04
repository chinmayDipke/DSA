package Arrays;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] arr = {2,5,3,12,5,9};

        System.out.println(secondSmallestElement(arr));
    }
    static int secondSmallestElement(int[] nums){
        int smallestElement = 99;

        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] < smallestElement ){
                smallestElement = nums[i];
            }
        }
        int secondlargest = 99;
        for(int i = 0; i < nums.length; i++ ){
            if(nums[i] < secondlargest && nums[i] != smallestElement){
                secondlargest = nums[i];
            }
        }
        return secondlargest;
    }
}
