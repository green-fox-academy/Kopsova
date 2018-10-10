import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Anagram {
    String string1;
    String string2;


    public Anagram(String string1, String string2) {
        this.string1 = string1;
        this.string2 = string2;
    }

    public boolean anagramCheck (String word, String drow) {

        ArrayList<String> array1 = new ArrayList(Arrays.asList(word));
        ArrayList<String> array2 = new ArrayList(Arrays.asList(drow));
        if (array1.size()!=array2.size()) {
            return false;
        }else  {
            for (int i = 0; i < array1.size() ; i++) {
                if (
                array1.get(i) != array2.get(array2.size() -i)){
                    return false;
                }
            }
        }return true;
    }
}
