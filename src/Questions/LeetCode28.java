package Questions;

public class LeetCode28 {

    public static void main(String[] args) {
        String s = "sadbutsad";
        String n = "sad";
        System.out.println(strStr1(s,n));
    }


    static int strStr(String haystack, String needle) {
        if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        }
        return -1;
    }

    static int strStr1(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
