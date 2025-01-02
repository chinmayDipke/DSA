package Questions;

public class LeetCode9 {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";




      System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        //char[] myArray = s.toCharArray();
        s.toLowerCase();
        s.replaceAll("[^a-zA-Z0-9]", "");
        s.trim();
        int end = s.length() - 1 ;
        int start = 0;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;


        }


        return true;
    }
}
