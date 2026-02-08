package Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {
        int a[]={2,4,6,8};
        int b[]={1,3,5,7};
        int[] arr=new int[a.length+b.length];
        mergeTwoSortedArrays(a,b,arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
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
