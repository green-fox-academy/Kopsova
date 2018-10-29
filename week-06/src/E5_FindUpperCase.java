import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class E5_FindUpperCase {

    //Write a Stream Expression to find the uppercase characters in a string!

    public static void main (String [] args) {
       String myString = "sniosoisFHHJIOk";
        ArrayList<Character> charList =new ArrayList<Character>();
        for (int i = 0; i < myString.length() ; i++) {
            charList.add(myString.charAt(i));
        }
       
//       List<Characters> charList = new ArrayList<Characters>(myString.chars()
//               .mapToObj(n-> (char) n)).collect(Collectors.toList());



       List<Character> upperCased = new ArrayList<>();
       upperCased= charList.stream().filter(n -> Character.isUpperCase(n)).collect(Collectors.toList());
       upperCased.stream().forEach(n-> System.out.println(n));

    }
}
