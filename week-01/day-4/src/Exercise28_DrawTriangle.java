import java.util.Scanner;

public class Exercise28_DrawTriangle {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// triangle like this:
//
// *
// **
// ***
// ****
//
// The triangle should have as many lines as the number was

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input integer number");
        int a = scanner.nextInt();
        for (int z = 1; z<=a; z++) {
            int p=0;
            while (p<z) {
                System.out.print("*");
                p++;
            }
            System.out.println();
            }
        }


    }

