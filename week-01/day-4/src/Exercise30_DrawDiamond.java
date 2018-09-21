import java.util.Scanner;

public class Exercise30_DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// diamond like this:
//
//
//    *
//   ***
//  *****
// *******
//  *****
//   ***
//    *
//
// The diamond should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int j = scanner.nextInt();

        int a = j / 2 + 1;

        int h = 1;

        for (int z = 1; z <= a; z += 1) {

            int m = a - z;
            int q = 1;
            while (q <= m) {
                System.out.print(" ");
                q++;
            }

            int w = 1;

            while (w <= h) {
                System.out.print("*");
                w++;

            }

            System.out.println();
            h += 2;
        }

        int a1= j/2;
        int a2 = (a1*2)-1;
        int h1 =1;
        for (int z1 = 1; z1<=j; z1++ ) {

            int s1 = 1;
            while (s1<=z1) {
                System.out.print(" ");
                s1++;
            }


            int w1= 1;
            while (w1 <= a2) {
                System.out.print("*");
                w1++;
            }
            System.out.println();
            a2-=2;






        }



    }



}

