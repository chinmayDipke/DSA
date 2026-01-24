package Pattern;

public class StarTriangleVerticallyFlipped {

    public static void main(String[] args) {
        int row = 5;
        /*for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                if(i+j > row) System.out.print(row-j+1+" ");
                else System.out.print("  ");
            }
            System.out.println();
        }*/
        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
