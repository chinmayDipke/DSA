package Pattern;

import java.sql.SQLOutput;
import java.util.Scanner;

public class BasicShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int row = sc.nextInt();
//        int col = sc.nextInt();
        int row = 5;
        int col = 5;


        /*for (int i = 1;i<=row;i++){
            for (int j = 1;j<=col;j++){
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=col;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=col;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((char)(i+64)+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                if(i%2==0) continue;
                System.out.print(j+" ");
            }
            for (int j = 1;j<=i;j++){
                if(i%2!=0) continue;
                System.out.print((char)(j+64)+" ");
            }
            System.out.println();
        }



        for (int i = row;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print((i-j+1)+" ");
            }
            System.out.println();
        }


        for (int i = row;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for (int i = row;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print((row-i+1)+" ");
            }
            System.out.println();
        }



        for (int i = row;i>0;i--){
            for (int j = i;j>0;j--){
                System.out.print((char)(row-j+96+1)+" ");
            }
            System.out.println();
        }



        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=row+1-i;j++){
                System.out.print((char)(j+96)+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=col;j++){
                if(i==1 || j==1 || i==row || j==col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();

        }

        for (int i = 1;i<=row;i++){
            int mid = row/2 +1;
            for (int j = 1;j<=col;j++){
                if(i==mid || j==mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }



        for (int i = 1;i<=row;i++){

            for (int j = 1;j<=col;j++){
                if(i==j || i==col-j+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();

        }



        int num = 1;
        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                System.out.print((num++)+" ");
            }
            System.out.println();
        }


        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=i;j++){
                if((i+j)%2==0) System.out.print("1 ");
                else System.out.print("0 ");
            }
            System.out.println();
        }

        for (int i = 1;i<=row;i++){
            int num = 1;
            for (int j = 1;j<=i;j++){
                System.out.print(num+" ");
                num+=2;
            }
            System.out.println();
        }
*/

        for (int i = 1;i<=row;i++){
            for (int j = 1;j<=col;j++){
                if(i+j > row) System.out.print(row-i+1 +" ");
                else System.out.print("  ");
            }
            System.out.println();
        }




    }
}
