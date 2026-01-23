package Practice;

import java.util.Arrays;

public class DailyPractice {

    public static int minOfMax(int[][] arr){
        int max = Integer.MAX_VALUE;
        for (int i = 0; i< arr.length;i++ ){
            int maxRow = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > maxRow) {
                    maxRow = arr[i][j];
                }
            }
            if(maxRow < max){
                max = maxRow;
            }
        }
        return max;
    }
    public static void main(String[] args) {

        int[][] arr = {{1,2,3},{4,5,6},{9,8,7}};
        for (int i = 0; i< arr.length;i++ ){
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[j][i]);
            }
        }

    }
}
