package Maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(20,40));
       System.out.println(lcm1(20,40));
    }
    //O(N)
    static int lcm(int n1, int n2){
        int max = Math.max(n1, n2);
        for(int i = Math.max(n1,n2);i>=1;i--){
            if(i % n1 == 0 && i % n2 == 0){
                max = i;

            }
        }

        return max;
    }


    static int lcm1(int n1, int n2){
        int sum = 1;

        while(true){

            if(n1*sum%n2==0){
                return n1*sum;
            }
            sum++;
        }
    }
}
