package Questions;

public class LeetCode258 {
    public static void main(String[] args) {
        System.out.println(addDigits(56));
    }
    static int addDigits(int num) {
        int sum = 0;


        while (num > 0) {
            int end = num % 10;
            sum += end;
            num /= 10;
        }


        return sum >= 10 ? addDigits(sum) : sum;
    }
}
