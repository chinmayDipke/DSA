package Recusion;

public class CountZero {
    public static void main(String[] args) {
        System.out.println(countZero(3000204));
    }

    static int countZero(int num){



        if (num < 10) {
            return num == 0 ? 1 : 0;
        }

        int cnt = (num % 10 == 0) ? 1 : 0;

        return cnt + countZero(num / 10);

    }
}
