package Arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 5};
        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(union(nums1, nums2));
        System.out.println(intersection(nums1, nums2));
    }
    public static ArrayList<Integer> union(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int lastAdded = Integer.MIN_VALUE;

        while (i < nums1.length && j < nums2.length) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else if (nums1[i] > nums2[j]) {
                val = nums2[j++];
            } else {
                val = nums1[i++];
                j++;
            }

            if (lastAdded != val) {
                list.add(val);
                lastAdded = val;
            }
        }


        while (i < nums1.length) {
            if (lastAdded != nums1[i]) {
                list.add(nums1[i]);
                lastAdded = nums1[i];
            }
            i++;
        }

        while (j < nums2.length) {
            if (lastAdded != nums2[j]) {
                list.add(nums2[j]);
                lastAdded = nums2[j];
            }
            j++;
        }

        return list;
    }


    public static ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {

                    list.add(a[i]);

                    break;
                }
                if (b[j] > a[i]) {
                    break;
                }
            }
        }
        return list;
    }
}
