import java.nio.file.Path;
import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class E08TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // open and read it. The file data represents a tic-tac-toe
        // game result. Return 'X'/'O'/'draw' based on which player
        // has winning situation.
        String fileName = "win-o.txt";
       // String fileName = "win-x.txt";
        //String fileName = "draw.txt";



        System.out.println(ticTacResult("draw.txt"));
        // should print O

     //   System.out.println(ticTacResult("win-x.txt"))
        // should print X

     //   System.out.println(ticTacResult("draw.txt"))
        // should print draw
    }


    public static String ticTacResult (String fileName) {
        char charakter;

        try {
            Path myPath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i < 3; i++) {

                if ((lines.get(i).charAt(0) == lines.get(i).charAt(1) && lines.get(0).charAt(1) == lines.get(i).charAt(2))) {
                    return String.valueOf(lines.get(i).charAt(0)); //String.valueOf() - vrac9 hodnotu na String
                }
                if ((lines.get(0).charAt(i) == lines.get(1).charAt(i) && lines.get(1).charAt(i) == lines.get(2).charAt(i))) {
                    return String.valueOf(lines.get(0).charAt(i));
                }
                if ((lines.get(0).charAt(0) == lines.get(1).charAt(1) && lines.get(1).charAt(1) == lines.get(2).charAt(2))) {
                    return String.valueOf(lines.get(0).charAt(0));
                }
                if ((lines.get(0).charAt(2) == lines.get(1).charAt(1) && lines.get(1).charAt(1) == lines.get(2).charAt(0))) {
                    return String.valueOf(lines.get(0).charAt(2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }return "draw";
    }
}