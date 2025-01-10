package Questions;

import java.util.ArrayList;
import java.util.List;

public class LeetCode916 {
    public static void main(String[] args) {

        List<String> li = new ArrayList<>();
        li.add("amazon");
        li.add("apple");
        li.add("facebook");
        li.add("google");
        li.add("leetcode");

        String[] words2 = {"e", "o"};

        System.out.println(wordSubsets(li, words2));
    }

    static List<String> wordSubsets(List<String> words1, String[] words2) {
        List<String> result = new ArrayList<>();

        for (String str : words1) {
            if (containsAllChars(str, words2)) {
                result.add(str);
            }
        }

        return result;
    }

    static boolean containsAllChars(String word, String[] words2) {

        for (String sub : words2) {

            if (!word.contains(sub)) {
                return false;
            }
        }
        return true;
    }
}
