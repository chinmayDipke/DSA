package Recusion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(12));
    }

    static int reverse(int num) {
        if (num < 10) {
            return num;
        }
        return (num % 10) * 10 + reverse(num / 10);
    }
}
