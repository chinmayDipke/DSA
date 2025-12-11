package Practice;

import static java.lang.String.valueOf;

public class StringPractice {

    public static void main(String[] args) {
        String str = "Chinmay";

        System.out.println(str.length());

        char c = str.charAt(0);
        System.out.println(c);

        String sub = str.substring(0,3);
        System.out.println(sub);

        int index = str.indexOf("a");
        System.out.println(index);
        System.out.println(str.indexOf('c', 1));

        char[] arr = str.toCharArray();
        System.out.println(arr[6]);

        System.out.println(str.contains("inm"));

        String str2 = "Chinmay";
        System.out.println(str.equals(str2));

        String replace1 = str.replace('C', 'x');
        System.out.println(replace1);

        String replace2 = str.replace("Chi", "xyz");
        System.out.println(replace2);

        String s = "a,b,c";
        String[] parts = s.split(",");
        for(String p: parts){
            System.out.println(p);
        }

        System.out.println(s.join("-", s, str));
        char[] arr1 = {'h', 'e', 'l', 'l', 'o'};


        System.out.println(valueOf(arr1)); // Prints memory address (e.g., [C@15db9742)


        String s1 = valueOf(arr);
    }
}
