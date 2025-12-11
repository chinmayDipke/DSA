package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int x = Arrays.binarySearch(arr,3);
        System.out.println(x);

        String[] a = {"a", "b", "c", "" };
        String[] b = {"a", "b", "c"};
        //System.out.println(Arrays.equals(a, b));

         ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.add(0,40);
        System.out.println(list);

        System.out.println(list.get(1));
        list.set(1, 15);
        System.out.println(list);

        //ArrayList<String> list1 = Arrays.copyOf(a,5); NOT POSSIBLE
        list.remove(Integer.valueOf(20));
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(15);
        list2.add(25);
        System.out.println(list2);

        list2.remove(Integer.valueOf(15));
        System.out.println(list2);


    }
}
