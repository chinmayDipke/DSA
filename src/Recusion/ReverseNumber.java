package Recusion;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(1234));
    }

    static int reverse(int num) {

        if (num < 10) {
            return num;
        }
        int temp = num % 10;
        int sum = temp * 10;
        return reverse(num / 10 + sum);
    }
}
