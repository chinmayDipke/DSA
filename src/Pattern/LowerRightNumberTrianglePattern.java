package Pattern;

/*
Pattern Printed:
        5
      4 4
    3 3 3
  2 2 2 2
1 1 1 1 1
*/

public class LowerRightNumberTrianglePattern {
    public static void main(String[] args) {
        int row = 5, col = 5;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i + j > row)
                    System.out.print(row - i + 1 + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
