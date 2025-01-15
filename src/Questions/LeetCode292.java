package Questions;

public class LeetCode292 {
    public static void main(String[] args) {
        System.out.println(canWinNim1(4));
    }
    static boolean canWinNim(int n) {
        return (n % 4 != 0);
    }
    static boolean canWinNim1(int n) {
        if(n % 4 == 0)
            return false;
        else return true;
    }
}
