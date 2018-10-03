
import java.nio.file.Path;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class E09Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

String fileName = "duplicated-chars.txt";



    }
    public static ArrayList decrypt (String fileName){
        try {
            Path myPath = Paths.get(fileName);
            List<String> lines = Files.readAllLines(myPath);
            for (int i = 0; i <lines.size() ; i++) {
                for (int j = 0; j < lines.get(i).length(); j++) {
                   if(lines.get(i).charAt(j) == lines.get(i).charAt(j+1);){
                       lines.remove(i);
                       i--;

                               lines.get(i).charAt(j)
                    }

                }
            }

            }



    }
}