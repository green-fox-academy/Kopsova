import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

public class E7_FrequencyOfCharacter {

    //Write a Stream Expression to find the frequency of characters in a given string!
    public static void main (String [] args) {

        String myString = "snisssosoisFHHJIOk";


        ArrayList<Character> charsOfString =new ArrayList<Character>();
        for (int i = 0; i < myString.length() ; i++) {
            charsOfString.add(myString.charAt(i));
        }
        Map <Character,Long> frequencyOf=
                charsOfString.stream().collect(
                        Collectors.groupingBy(
                                Function.identity(),Collectors.counting()
                        )
                );
        System.out.println(frequencyOf);
    }

}
