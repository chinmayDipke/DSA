package Questions;

public class LeetCode2119 {
    public static void main(String[] args) {
        System.out.println(isSameAfterReversals(526));
    }

    public static boolean isSameAfterReversals(int num) {
        int x = num % 10;
        if(num==0){
            return true;
        }
        if(x==0){
            return false;
        }
        return true;
    }
}
