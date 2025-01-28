package Recusion;

import javax.sound.midi.Soundbank;

public class Palindrome {
    public static void main(String[] args) {
        int val = 1231;
        System.out.println(palind(val));
    }
    static boolean palind(int num){

        int n = reverse(num);
        if(n==num){
            return true;
        }


        return false;
    }
    public static int result = 0;
    static int reverse(int num) {
        if (num < 10) {
            return result * 10 + num;
        }
        result = result * 10 + num % 10;
        return reverse(num / 10);
    }
}
