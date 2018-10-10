import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void AnagramTestIsAnagram() {
        Anagram myAnagram = new Anagram("los", "sol");
        assertEquals(true, myAnagram.anagramCheck());
    }


    @Test
    public void AnagramTestDifferentSize(){
        Anagram myAnagram = new Anagram("losy", "sol");
        assertEquals(false, myAnagram.anagramCheck());
    }


    @Test
    public void AnagramTestDIfferentWords(){
        Anagram myAnagram = new Anagram("gtgtosy", "sol");
        assertEquals(false, myAnagram.anagramCheck());


    }


}