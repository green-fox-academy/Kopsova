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

        int a = j/2+1;

        int h = 1;

        for (int z = 1; z <= a; z+=1) {

            int m = a-z;
            int q =1;
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
            h+=2;
        }

        int r = 1;
        for (int b = a-j; r<=b; r++ ) {
            int k = 1;
            while(k<=r) {
                System.out.print("M");
                k++;
            }

            int o = 1;
            while (o>=a-b) {
                System.out.print("*");
                o++;
            }
            System.out.println();
            r+=2;
            }

        }

    }

