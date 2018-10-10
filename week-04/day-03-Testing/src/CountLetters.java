import java.util.HashMap;
import java.util.Map;

public class CountLetters {
String s ="";

    public CountLetters(String s) {
        this.s = s;
    }

    public int counLet (String str, char ch){
        str = this.s;

        int count =0;
        for (int i = 0; i < str.length() ; i++) {
            if (str.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }

    public HashMap<Character, Integer> createDictionary(){
       HashMap<Character, Integer> hMap = new HashMap<>();

        for (int i = 0; i < s.length() ; i++) {

            hMap.put(s.charAt(i), counLet(this.s, s.charAt(i)) );

        }
        return hMap;
    }
}
