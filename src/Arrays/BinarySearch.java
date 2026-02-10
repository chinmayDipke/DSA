package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr= { 5,4,3,2,1};

        //System.out.println(binarysearch(arr,5));
        //System.out.println(find(arr, 5));
        System.out.println(decendingBinarySearch(arr, 2));

    }

    static int decendingBinarySearch(int arr[], int target){
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = (low + high) / 2;
            if(target < arr[mid]){
                low = mid + 1;
            }
            else if (target > arr[mid]){
                high = mid - 1;
            }
            else{
                return mid;
            }
        }
        return  -1;
    }

    static ArrayList<Integer> find(int arr[], int target) {
        int low = 0;
        int high = arr.length - 1;
        int minidx = -1, maxidx = -1;
        ArrayList<Integer> al = new ArrayList<Integer>();
        while(low <= high){
            int mid = (low + high) / 2;
            if(target < arr[mid]){
                high = mid - 1;
            }
            else if (target > arr[mid]){
                low = mid + 1;
            }
            else{
                minidx = mid;
                high = mid - 1;
            }

        }
        al.add(minidx);
         low = 0;
         high = arr.length - 1;
        while(low <= high){

            int mid = (low + high) / 2;
            if(target < arr[mid]){
                high = mid - 1;
            }
            else if (target > arr[mid]){
                low = mid + 1;
            }
            else{

                maxidx = mid;
                low = mid + 1;;
            }
        }
        al.add(maxidx);
        return al;
    }


    static int binarysearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //int mid = start + (end - start) / 2;// not done (start + end) / 2 cuz (start + end) may get very large
            int mid = (start + end) / 2;// not done (start + end) / 2 cuz (start + end) may get very large
            if(target < arr[mid]){   // search at left side of array and update end by mid - 1
                end = mid - 1;
            }
            else if (target > arr[mid]){ // search at right side of array and update start by mid + 1
                start = mid + 1;
            }
            else{  // only here answer is returened
                return arr[mid];
            }
        }
        return -1;
    }


}
