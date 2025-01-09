package Arrays;

import java.util.Arrays;

public class ArbitaryArray {
    public static void main(String[] args) {
        int[][] arr={                                // 2-D array
                {10, 20, 30, 40, 50},
                {11, 21, 31, 41},
                {22}


        };
        System.out.println(Arrays.toString(search(arr, 22)));
    }
    static int[] search(int [][] matrix, int target){
        int row = 0;
        int col = matrix[0].length -1 ;
        while(row <= matrix.length-1 && col >= 0){
            col = matrix[row].length -1 ;
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
