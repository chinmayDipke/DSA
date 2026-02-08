package Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={5,3,6,9,2,7,1};
        merge(arr);
        for(int e:arr){
            System.out.print(e+" ");
        }
    }

    private static void merge(int[] arr) {
        int n=arr.length;
        if(n==1) return;
        //Step 1: make 2 empty array of size n/2
        int[] a=new int[n/2];
        int[] b=new int[n-n/2];

        //Step 2: copy and paste original array to them
        int idx=0;
        for (int i=0;i< a.length;i++) a[i]=arr[idx++];
        for (int i=0;i< b.length;i++) b[i]=arr[idx++];

        //step 3: magic
        merge(a);
        merge(b);
        //step 4 : merge 2 sorted array into 1
        mergeTwoSortedArrays(a,b,arr);
    }

    private static void mergeTwoSortedArrays(int[] a, int[] b, int[] arr) {
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if (a[i] <= b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while (i< a.length) arr[k++]=a[i++];
        while (j< b.length) arr[k++]=b[j++];
    }
}
