package Questions;

import java.util.ArrayList;
import java.util.Collections;

public class LeetCode989 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 0};
        int k = 21;
        System.out.println(addToArrayForm(arr, k));
    }
    public static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = 0;

        for (int i = 0; i < num.length; i++) {
            n = n * 10 + num[i];
        }
        n += k;
        while (n > 0) {
            list.add(n % 10);
            n /= 10;
        }
        Collections.reverse(list);
        return list;
    }
}
