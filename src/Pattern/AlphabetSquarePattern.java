package Pattern;

/*
Pattern Printed:
A B C D E
A B C D E
A B C D E
A B C D E
A B C D E
*/

public class AlphabetSquarePattern {
    public static void main(String[] args) {
        int row = 5, col = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}
