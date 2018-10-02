import java.io.BufferedWriter;
import java.lang.reflect.Array;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.*;

public class E07Logs {
    public static void main(String[] args) {
        // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.

        String mylogs = "logs.txt";

        System.out.println((uniqueIP(mylogs)).size());
        System.out.println(getPostRatio(mylogs));




    }
    public static ArrayList uniqueList (ArrayList list) {

        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).equals(list.get(j))) {
                    list.remove(j);
                    j--;
                }
            }
        }
        return list;
    }

    public static ArrayList<String> uniqueIP (String mylogs){
        ArrayList <String> onlyIP = new ArrayList<>();

        try {
           Path myPath = Paths.get(mylogs);
           List<String> logs = Files.readAllLines(myPath);
           for (int i = 0; i < logs.size(); i++) {
              onlyIP.add(logs.get(i).substring(27,39));
               //onlyIP.add(logs.substring(27,39)); logs is not a string!!! nefungovalo substring
           }
       }catch (Exception e){
            e.printStackTrace();
        }
        Collections.sort(onlyIP);

        return uniqueList(onlyIP);

    }


    public static double getPostRatio (String mylogs){
        int get =0;
        int posts =0;
        ArrayList <String> onlyGetsPost = new ArrayList<>();
        try {
            Path myPath = Paths.get(mylogs);
            List<String> logs = Files.readAllLines(myPath);
            for (int i = 0; i < logs.size(); i++) {

                if (logs.get(i).substring(41,44).equals("GET")) {
                    get ++;
                }
                if (logs.get(i).substring(41,45).equals("POST")) {
                    posts++;
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        double ratio = (double)get/(double)posts;
        return ratio;



    }

}