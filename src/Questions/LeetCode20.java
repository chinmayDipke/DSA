package Questions;

public class LeetCode20 {

    public static void main(String[] args) {
        String s = "([)]";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {

        int num = 0;
        for(int i = 0; i<=s.length()-1;i++){
            if(s.charAt(i) == '{')
                num += 3;
            else if(s.charAt(i) == '}')
                num -= 3;
            else if(s.charAt(i) == '[')
                num += 2;
            else if(s.charAt(i) == ']')
                num -= 2;
            else if(s.charAt(i) == '(')
                num += 1;
            else if(s.charAt(i) == ')')
                num -= 1;
            else
                System.out.println(num);

        }
        return (num==0);
    }
}
