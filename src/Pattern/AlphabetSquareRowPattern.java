package Pattern;

/*
Pattern Printed:
A A A A A
B B B B B
C C C C C
D D D D D
E E E E E
*/

public class AlphabetSquareRowPattern {
    public static void main(String[] args) {
        int row = 5, col = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}
