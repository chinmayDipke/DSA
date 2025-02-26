package Arrays;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SuperiorElements {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 4, 0, 6};
        String p = Arrays.toString(SuperiorElements(arr));
        System.out.println(p);
    }

    static int[] SuperiorElements(int[] nums) {
        int[] ans = new int[nums.length];
        int pos = 0;
        int maxi = 0;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] > maxi) {
                ans[pos] = nums[i];
                maxi = nums[i];
                pos++;
            }
        }


        return Arrays.copyOf(ans, pos);
    }
}
