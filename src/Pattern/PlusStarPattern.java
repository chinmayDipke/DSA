package Pattern;

/*
Pattern Printed:
    *
    *
* * * * *
    *
    *
*/

public class PlusStarPattern {
    public static void main(String[] args) {
        int row = 5, col = 5;
        int mid = row / 2 + 1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (i == mid || j == mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
