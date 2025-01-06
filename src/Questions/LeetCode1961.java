package Questions;

public class LeetCode1961 {
    public static void main(String[] args) {
        String[] words = {"i", "love", "leetcode", "apples"};
        String s = "iloveleetcode";
        System.out.println(isPrefixString(s, words));
    }

    static boolean isPrefixString(String s, String[] words) {
        String str = "";

        for (int i = 0; i < words.length; i++) {
            str += words[i];
            if (str.equals(s)) {
                return true;
            }
            if (str.length() > s.length()) {
                return false;
            }
        }
        return false;
    }
}
