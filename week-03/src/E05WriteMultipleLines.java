import java.io.BufferedWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class E05WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number,
// than it should write to a file.
// The path parameter should be a string, that describes the location of the file.
// The word parameter should be a string, that will be written to the file as lines
// The number paramter should describe how many lines the file should have.
// So if the word is "apple" and the number is 5, than it should write 5 lines
// to the file and each line should be "apple"
// The function should not raise any error if it could not write the file.
String myPath = "soubor.txt";
String word = "Strawberry";
int number = 5;
writesMultipleLine(myPath,word,number);


    }

    public static void writesMultipleLine (String myPath, String word, int number) {

        List <String> content = new ArrayList<>();
        for (int i = 0; i < number ; i++) {
            content.add(word);

           }
        try{
            Path filePath = Paths.get(myPath);
            Files.write(filePath, content);

            }catch (Exception e){

        }

        }



    }



