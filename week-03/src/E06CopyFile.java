import java.io.BufferedWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class E06CopyFile {
    public static void main(String[] args) {
        // Write a function that copies a file to an other
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful


        String originalFile = "soubor.txt";
        String coppiedFile =  "newsoubor.txt";
        System.out.println(copyFiles(originalFile,coppiedFile));
    }

    public static boolean copyFiles (String originalFile, String coppiedFile){

        try{
            Path filePath = Paths.get(originalFile);
            Path coppiedFilePath = Paths.get(coppiedFile);
            Files.copy(filePath, coppiedFilePath);
            return true;
        } catch (Exception e) {
            return false;
        }



    }
}