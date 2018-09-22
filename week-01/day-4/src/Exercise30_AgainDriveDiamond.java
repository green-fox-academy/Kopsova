import java.util.Scanner;

public class Exercise30_AgainDriveDiamond  {


    public static void main(String[] args) {


        Scanner ascanner;
        ascanner = new Scanner(System.in);

        System.out.println("Input number of lines");
        int totalrows;
        totalrows = ascanner.nextInt();
        int upperhalfrows = totalrows/2 +1;

        int longestrow = 0;


        for ( int rowNo = 1; rowNo <= upperhalfrows; rowNo++ ) {

            for (int spaces = 1; spaces <= (upperhalfrows-rowNo); spaces++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= rowNo * 2 - 1; stars++) {
                System.out.print("*");
                longestrow = stars;
            }
            System.out.println();
        }
        for (int lowerRowNo = 1; lowerRowNo <= totalrows - upperhalfrows; lowerRowNo++ ) {

            for ( int spacesDown = 1; spacesDown <= lowerRowNo; spacesDown++) {
                System.out.print(" ");
            }
            for (int starsDown = longestrow -2*lowerRowNo ; starsDown >=1; starsDown-=1) {
                System.out.print("*");
            }
            System.out.println();
        }






    }
}
