public class Exercise35_DrawChessTable {

    public static void main(String[] args) {

        // Crate a program that draws a chess table like this
//
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %
// % % % %
//  % % % %



        String line1 = "% % % % ";
        String line2 = " % % % %";

        for (int i=1; i <= 4; i++)  {
            System.out.println(line1);
            System.out.println(line2);

        }
    }
}
