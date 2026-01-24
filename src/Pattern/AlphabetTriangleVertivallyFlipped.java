package Pattern;

public class AlphabetTriangleVertivallyFlipped {
    public static void main(String[] args) {
        int row = 5;
        /*for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }





        for (int i = 1; i <= row; i++) {

            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= row-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int nst= 1, nss=row-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nss; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nss--;
            nst += 2;
            System.out.println();
        }

        int nst= 1, nss=row-1;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nss; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nss--;
            nst += 2;
            System.out.println();
        }
        nst= 2*row-3;
        nss=1;

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= nss; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nss++;
            nst -= 2;
            System.out.println();
        }*/
        for (int i = 1; i <= 2*row-1; i++) {
            for (int j = 1; j <= 2*row-1; j++) {
                int a =i, b=j;
                if(i>row) a=2*row-i;
                if(j>row) b=2*row-j;
                System.out.print(Math.min(a,b)+" ");
            }

            System.out.println();
        }






    }
}
