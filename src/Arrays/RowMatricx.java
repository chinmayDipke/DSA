package Arrays;

import java.util.Arrays;

public class RowMatricx {
    public static void main(String[] args) {
        int[][] arr={
            {10, 20, 30, 40},
            {11, 21, 31, 41},
            {12, 22, 32, 42}


        };
        System.out.println(Arrays.toString(search(arr, 50)));
    }

    static int[] search(int [][] matrix, int target){
        int row = 0;
        int col = matrix.length -1 ;
        while(row < matrix.length && col >= 0){

            if(matrix[row][col] == target){
                return new int[]{row,col};
            }

            if(matrix[row][col] < target){
                row++;
            }

            else{
                col--;
            }


        }

        return new int[]{-1,-1};
    }
}
