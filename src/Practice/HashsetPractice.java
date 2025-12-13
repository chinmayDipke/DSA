package Practice;

import java.util.HashSet;
import java.util.Set;

public class HashsetPractice {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(29);
        System.out.println(set);
        System.out.println(set.add(3));
        System.out.println(set);

        System.out.println(set.contains(1)); // true
        System.out.println(set.contains(4)); // false


        System.out.println(set.remove(29));
        System.out.println(set.size());
        System.out.println(set.isEmpty());

    }
}
