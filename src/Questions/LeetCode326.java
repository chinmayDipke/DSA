package Questions;

public class LeetCode326 {
    public static void main(String[] args) {

        int n = 3;

        System.out.println(isPowerOfThree(n));

    }
    static boolean isPowerOfThree(int n) {

        for(int i = 0; i<=n; i++){

            double ans = Math.pow(2,i);
            if(ans==n)
                return true;
        }

        return false;
    }
}
