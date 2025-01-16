package Maths;

public class GCD_HCF_GCF {
    public static void main(String[] args) {
        System.out.println(gcd_hcf(20,40));
        System.out.println(gcd_hcf1(20,40));
    }
    //O(N)
    static int gcd_hcf(int n1, int n2){
        int sum = 1;
        for(int i = 1;i<=Math.min(n1,n2);i++){
            if(n1 % i == 0 && n2 % i == 0){
                sum = i;

            }
        }

        return sum;
    }

    //O(min(n1,n2)
    static int gcd_hcf1(int n1, int n2){
        int sum = 1;
        for(int i = Math.min(n1,n2);i>=1;i--){
            if(n1 % i == 0 && n2 % i == 0){
                sum = i;
                break;
            }
        }

        return sum;
    }

}
