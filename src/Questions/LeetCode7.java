package Questions;

public class LeetCode7 {
    public static void main(String[] args) {
        System.out.println(reverse(120));
    }
    static int reverse(int x) {
        double result = 0;
        while (x != 0)
        {
            double end = x % 10;  //values are large after the sum
            double newResult = result * 10 + end;
            if(newResult > Integer.MAX_VALUE || newResult < Integer.MIN_VALUE)
                return 0;
            result = newResult;
            x = x / 10;
        }

        return (int)result;
    }
}
