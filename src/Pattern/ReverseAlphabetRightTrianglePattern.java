package Pattern;

/*
Pattern Printed:
a b c d e
a b c d
a b c
a b
a
*/

public class ReverseAlphabetRightTrianglePattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((char)(row - j + 97) + " ");
            }
            System.out.println();
        }
    }
}
