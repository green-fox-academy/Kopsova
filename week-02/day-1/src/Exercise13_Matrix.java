import java.util.Arrays;

public class Exercise13_Matrix {
    public static void main (String[] args){

        int multiArray[][] = new int[4][4];

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j < 4; j++) {

                if (i == j) {
                    multiArray[i][j] = 1;
                } else {
                    multiArray[i][j] = 0;
                }
            }
        }


        for (int i = 0; i <4 ; i++) {
            System.out.println();
            for (int j = 0; j <4 ; j++) {

                System.out.print(multiArray[i][j]);


            }

        }



        }



    }

