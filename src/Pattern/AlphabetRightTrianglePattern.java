package Pattern;

/*
Pattern Printed:
A
B B
C C C
D D D D
E E E E E
*/

public class AlphabetRightTrianglePattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}
