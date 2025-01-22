package Questions;

public class LeetCode344 {
    public static void main(String[] args) {
        String[] s ={"h","e","l","l","o"};
        System.out.println(reverseString(s));
    }
    public static void reverseString(char[] s) {
        int start = 0, end = s.length - 1;

        while (start < end) {

            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;


            start++;
            end--;
        }

    }
}
