package Questions;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode389 {
    public static void main(String[] args) {
        String s ="abcd";
        String t ="abcde";
        System.out.println(findTheDifference(s,t));
    }
    static char findTheDifference(String s, String t) {
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i]) {
                return tArray[i];
            }
        }

        return tArray[tArray.length - 1];
    }
}
