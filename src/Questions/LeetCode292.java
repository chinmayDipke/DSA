package Questions;

public class LeetCode292 {
    public static void main(String[] args) {
        System.out.println(canWinNim(4));
    }
    static boolean canWinNim(int n) {
        return (n % 4 != 0);

    }
}
