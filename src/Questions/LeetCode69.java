package Questions;



//https://leetcode.com/problems/sqrtx/
public class LeetCode69 {

    public static void main(String[] args) {
        int x= 9;
        System.out.println(mySqrt(x));
    }
    static int mySqrt(int x) {
        if(x==0||x==1){
            return x;
        }
        for(int i=1;i<=x;i++){
            if(i*i>x){
                return i-1;
            }

        }
        return -1;
    }
}
