package Questions;

public class LeetCode58 {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord1(s));
        System.out.println(lengthOfLastWord(s));
    }



    static int lengthOfLastWord1(String s) {
        s = s.trim();
        String[] str = s.split(" ");


        return str[str.length - 1].length();
    }
    static int lengthOfLastWord(String s) {
        s = s.trim();

        int cnt = 0;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' ')
                cnt++;
            else if (cnt > 0) {
                break;
            }
        }
        return cnt;
    }
}
