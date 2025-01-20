package Arrays;

import java.util.Arrays;

public class Triplets_Sum_Zero {
    public static void main(String[] args) {
        int[] x = {0, -2, 5, -3, 2};//0, -2, 2
        System.out.println(Arrays.toString(new int[][]{triplet(x)}));
    }
    static int[] triplet(int[] x){
        int n = x.length;
        int[] res = {};
        for(int i = 0; i < n - 2;i++){
            for(int j = i + 1; j < n - 1;j++){
                for(int k = j + 1; k < n-1;k++){
                    if(x[i] + x[j] + x[k] == 0){
                        for(int y=0;y<k;y++){
                            res++ = x[i];
                            res++ = x[j];
                            res++ = x[k];
                        }
                    }
                }
            }

        }



        return res;
    }
}
