package Questions;

public class LeetCode2185 {
    public static void main(String[] args) {
        String[] words ={"pay","attention","practice","attend"};
        String p = "at";
        System.out.println(prefixCount(words,p));
    }
    static int prefixCount(String[] words, String pref) {
        int count = 0;

        for (String str : words) {
            if (str.length() >= pref.length()) {
                boolean isPrefix = true;


                for (int j = 0; j < pref.length(); j++) {
                    if (str.charAt(j) != pref.charAt(j)) {
                        isPrefix = false;
                        break;
                    }
                }

                if (isPrefix) {
                    count++;
                }
            }
        }

        return count;
    }
}
