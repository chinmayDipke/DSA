package Pattern;

/*
Pattern Printed:
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

public class ReverseNumberRightTriangleIncrementPattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((i - j + 1) + " ");
            }
            System.out.println();
        }
    }
}
