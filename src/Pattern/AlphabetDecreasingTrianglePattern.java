package Pattern;

/*
Pattern Printed:
a b c d e
a b c d
a b c
a b
a
*/

public class AlphabetDecreasingTrianglePattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row + 1 - i; j++) {
                System.out.print((char)(j + 96) + " ");
            }
            System.out.println();
        }
    }
}
