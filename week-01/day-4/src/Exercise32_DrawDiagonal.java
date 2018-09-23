import java.util.Scanner;

public class Exercise32_DrawDiagonal {

    public static void main(String[] args) {

        // Write a program that reads a number from the standard input, then draws a
// square like this:
//
//
// %%%%%
// %%  %
// % % %
// %  %%
// %%%%%
//
// The square should have as many lines as the number was
        System.out.println("Input integer number");
        Scanner scanner = new Scanner(System.in);
        int numberOflines = scanner.nextInt();

        String frontSpacesString = "";
        String endSpacesString = "";


        int lineNo;
        int backspaces = 0;
        int fs = 0;


        //first row
        for (int i = 1; i <= numberOflines; i++) {
            System.out.print("%");
        }
        System.out.println();


        for (int row =2; row <= numberOflines-1; row++) {
            String frontSpaceString = frontSpacesString + " ";

             for (int front =0; front < row-2; front++) {
                 frontSpacesString = frontSpacesString + " ";
              }

              for (int back =0; back < numberOflines-row-1; back++) {
                  endSpacesString = endSpacesString +" ";
              }
            System.out.println("%" + frontSpacesString + "%" + endSpacesString + "%");
              frontSpacesString = "";
              endSpacesString = "";


        }






         //last row

        for (int i = 1; i <= numberOflines; i++) {
            System.out.print("%");
        }


        }
    }






