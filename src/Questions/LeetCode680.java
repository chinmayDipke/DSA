package Questions;

public class LeetCode680 {

    public static void main(String[] args) {
        String s = "eeccccbebaeeabebccceea";
        System.out.println(validPalindrome(s));
    }
        static boolean validPalindrome(String s) {

            int mid = 1 + (s.length()-1) / 2;
            int start = 0;
            int end = s.length()-1;

            while(start<=end){
                if(s.charAt(start) == s.charAt(end) ){
                    start++;
                    end--;
                }
                else return possible(s,start + 1, end) || possible(s,start,end-1);
            }
            return true;

        }

        static boolean possible(String s, int start, int end){
            while(start<=end){
                if(s.charAt(start) == s.charAt(end) ){
                    start++;
                    end--;
                }
                else
                    return false;
            }
            return true;
        }


}
