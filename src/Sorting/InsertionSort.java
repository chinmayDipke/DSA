package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        //int[] arr = { 5,7,1,0,2,1,-1,2,3,2,3 };
        int[] arr = { 3,4,3,2,1,2,1 };
        //int[] arr = { 5, -3, 4, 2, -2, 1, 2, 2, 3, -1 };


        insertionSort1(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr) {

        for (int i = 0; i <= arr.length - 2; i++) {
            for (int j = i+1; j <= arr.length - 1; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                } else if(arr[j] != arr[j-1]){
                    break;
                }
            }
        }
    }
    static void insertionSort1(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if(arr[j] < arr[j-1]){

                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                } else{
                    break;
                }
            }
        }
    }
}
