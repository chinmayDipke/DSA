package Questions;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
    static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int len = s.length();
        for(int i = 0;i < len/2; i++){

            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
}
