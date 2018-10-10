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

    public boolean anagramCheck () {


        for (int i = 0; i <this.string1.length() ; i++) {

        }
        if (this.string1.length()!=this.string2.length()) {
            return false;
        }else  {
            for (int i = 0; i < this.string2.length() ; i++) {
                if (
                this.string1.charAt(i) != this.string2.charAt(this.string2.length() -i-1)){
                    return false;
                }
            }
        }return true;
    }
}
