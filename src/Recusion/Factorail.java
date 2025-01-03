package Recusion;

public class Factorail {
    public static void main(String[] args) {
        int x = 4;
        System.out.println(fact(x));

    }
    static int fact(int x){

        if(x == 0)
            return 1;

        return (x * fact(x-1));
    }
}
