package Questions;

import java.util.Arrays;

public class LeetCode73 {
    public static void main(String[] args) {
        int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};

        // Call the method
        setZeroes(mat);

        // Print the matrix correctly
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[] row = new int[rows];
        int[] col = new int[cols];

        // Mark the rows and columns that need to be zeroed
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(matrix[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }

        // Set the elements to zero based on the markers
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(row[i] == 1 || col[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
