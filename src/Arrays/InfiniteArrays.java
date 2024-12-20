package Arrays;

public class InfiniteArrays {
    public static void main(String[] args) {
        int[] arr= { 2,3,5,6,8,9,10,13 };
        int target = 45;
        System.out.println(areyfind(arr, target));
    }
    static int areyfind(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > arr[end]) {

            int newstart = end + 1 ;

            end = end + (end - start + 1) * 2 ;

            start = newstart;
        }
        return binarySearch(arr, target, start, end);

        }


    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
             int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
