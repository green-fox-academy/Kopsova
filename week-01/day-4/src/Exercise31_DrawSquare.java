import java.util.Scanner;

public class Exercise31_DrawSquare {

    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %   %
// %   %
// %   %
// %   %
// %%%%%
//
// The square should have as many lines as the number was

        System.out.println("Input integer number");
        Scanner scanner = new Scanner(System.in);
        int numberOfLines = scanner.nextInt();

        //first row
        for (int firstrow = 1; firstrow <= numberOfLines; firstrow++) {
            System.out.print("%");
        }
        // from second row to last row - 1
        System.out.println();
        for (int row = 2; row <= numberOfLines - 1; row++){
            System.out.print("%");
            for (int spaces = 1; spaces <= numberOfLines - 2; spaces++){
                System.out.print(" ");
            }
            System.out.print("%");
            System.out.println();
        }
        // last row
        for (int firstrow = 1; firstrow <= numberOfLines; firstrow++) {
            System.out.print("%");
        }



    }
}
