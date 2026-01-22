package Pattern;

/*
Pattern Printed:
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9
*/

public class OddNumberRightTrianglePattern {
    public static void main(String[] args) {
        int row = 5;

        for (int i = 1; i <= row; i++) {
            int num = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
}
