package Questions;

public class LeetCode709 {
    public static void main(String[] args) {
        String s ="Hello";
        System.out.println(toLowerCase(s));
    }
        static String toLowerCase(String s) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {

                char c = s.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    sb.append((char) (c + 32));
                } else {
                    sb.append(c);
                }
            }
            return sb.toString();
        }


}
