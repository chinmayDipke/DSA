package Pattern;

/*
Pattern Printed:
1 1 1 1 1
2 2 2 2
3 3 3
4 4
5
*/

public class ReverseNumberTriangleRowCountPattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = row; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print((row - i + 1) + " ");
            }
            System.out.println();
        }
    }
}
