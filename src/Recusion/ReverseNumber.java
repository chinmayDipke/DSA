package Recusion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(121345));
    }

    public static int result = 0;
    static int reverse(int num) {
        if (num < 10) {
            return result * 10 + num;
        }
        result = result * 10 + num % 10;
        return reverse(num / 10);
    }
}
