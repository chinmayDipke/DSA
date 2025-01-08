package Questions;

public class LeetCode3042 {
    public static void main(String[] args) {

        String[] words = {"a","aba","ababa","aa"};
        System.out.println(countPrefixSuffixPairs(words));
    }


    static int countPrefixSuffixPairs(String[] words) {
        int count = 0;


        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) {
                    count++;
                }
            }
        }

        return count;
    }
}
