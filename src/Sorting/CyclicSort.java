package Sorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3,4,5,1,2 };


        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
//cyclic sort is applied to the array when search is dome from 0,1 to nj
    static void cyclicSort(int[] arr) {
       int i = 0;
        while(i < arr.length){
            int index = arr[i] - 1;
            if (arr[i] != arr[index]) {
                swap(arr, i, index);
            } else{
                i++;
            }
        }


    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}
