package Questions;

public class LeetCode509 {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        if(n == 1)
            return n;
        if(n == 0)
            return n;

        return fib(n-1) + fib(n-2);
    }
}
