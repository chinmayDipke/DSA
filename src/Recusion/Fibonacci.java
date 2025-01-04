package Recusion;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 4;
        int[] arr=null;
        // int[] arr;
       System.out.println((fibo(x)));
       /* int n=0, n1 = 1;
        int n2 ;
        System.out.println(n);
        System.out.println(n1);
        for(int i =2; i<=x; i++) {
            n2 = n + n1;
            System.out.println(n2);
            n = n1;
            n1 = n2;*/
        }
        static int fibo(int n){
            if(n == 0)
                return n;
            else if(n==1)
                return n;

        return fibo(n-1) + fibo(n-1);
        }
    }


