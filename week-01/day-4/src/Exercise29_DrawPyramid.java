import java.util.Scanner;

public class Exercise29_DrawPyramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// pyramid like this:
//
//
//    *
//   ***
//  *****
// *******
// 1 3 5 7 9
//2 1
// The pyramid should have as many lines as the number was


        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        int a = scanner.nextInt();
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
    }
}
