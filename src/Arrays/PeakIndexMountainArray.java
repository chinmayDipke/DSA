package Arrays;


public class PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr= { 2,3,5,6,7,6,3,1 };

       // System.out.println(peak(arr));
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peak(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }
        return -1;
    }
    static int peakIndexInMountainArray(int[] arr){
        int low = 0;
        int high = arr.length - 1;

        while (low < high)
        {
            int mid = low + (high - low) / 2;

            // right side
            if (arr[mid] > arr[mid + 1])
            {
                high = mid;
            }
            else
            {
                low = mid + 1;
            }
        }
        return low;
    }

}
