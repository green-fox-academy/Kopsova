import java.util.Scanner;

public class Exercise30_DrawDiamantByAles  {

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

//def variables
        String mezerString;
        String hvezdString;
        String rowString;
        int rowCount;
        int mezer;
        int hvezd;

//def objects
        Scanner vstup = new Scanner(System.in);

//code
        System.out.println("zadej pocet radek:");
           rowCount = vstup.nextInt();

        mezer = rowCount/2;
        hvezd = rowCount - 2*mezer;

        System.out.println("------------------------");
        //smycka po radcich
        for(int row=1;row<=rowCount;row++)
        {
            mezerString = "";
            hvezdString = "";
            rowString = "";

            for(int i=1;i<=mezer;i++)
                mezerString = mezerString + " ";

            for(int i=1;i<=hvezd;i++)
                hvezdString = hvezdString + "*";

            rowString = mezerString + hvezdString + mezerString;

            System.out.println(rowString);

            if (row > rowCount/2)
            {
                mezer++;
                hvezd-=2;
            }
            else
            {
                mezer--;
                hvezd+=2;
            }
        }
        System.out.println("------------------------");
    }
}
