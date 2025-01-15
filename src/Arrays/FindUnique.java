package Arrays;



public class FindUnique {
    public static void main(String[] args) {
        int[] arr = {2,3,5,2,3,5,6};
        System.out.println(duplicate(arr));
    }
    static int duplicate(int[] arr){
        int unique = 0;

        for(int i = 0;i < arr.length;i++){
            unique = unique ^ arr[i];
        }


        return unique;
    }
}
