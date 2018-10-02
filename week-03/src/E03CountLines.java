import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.List;

public class E03CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.
        Path filePath = Paths.get("myfile.txt", "nextfile.txt");
        System.out.println(noOfLines(filePath));


    }

    public static int noOfLines(Path filePath) {
        int result=0;
        try {
            List<String> lines = Files.readAllLines(filePath);
             result = lines.size();

            return result;

        } catch (Exception e) {

        } return result;
    }
}
