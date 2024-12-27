package Questions;

public class Palindrome {
    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome2(x));
    }
    static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = Integer.toString(x);
        int len = s.length();
        for(int i = 0;i < len/2; i++){

            if(s.charAt(i) != s.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    static boolean isPalindrome2(int x) {
        if(x<0){
            return false;
        }
        int val = 0, sum = 0, num = x;

        while(x > 0){
            val = num % 10;
            sum = sum * 10 + val;
            num /= 10;

        }

            return (sum == num);



    }
}
