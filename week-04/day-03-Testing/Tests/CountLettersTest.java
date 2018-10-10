import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class CountLettersTest {

    @Test
    public void counLet() {
    }

    @Test
    public void createDictionary() {
CountLetters myCounter = new CountLetters("ahooj");
        HashMap<Character, Integer> myMap = new HashMap<>();
        myMap.put('a',1);
        myMap.put('h',1);
        myMap.put('o',2);
        myMap.put('j',1);

assertEquals(myMap, myCounter.createDictionary());


    }
}