import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void IfTextIsAnagram() {
        String first = "sol";
        String second = "los";

        assertEquals(true, Anagram.isAnagram(first, second));


    }


    @Test
    public void IfTextIsAnagramOneAnagramEmpty() {
        String first = "";
        String second = "sol";

        assertEquals(false, Anagram.isAnagram(first, second));


    }

    @Test
    public void IfTextIsAnagramOneAnagramIsNull() {
        String first = null;
        String second = "sol";

        assertEquals(false, Anagram.isAnagram(first, second));


    }

    @Test
    public void IfTextIsAnagramBothAnagramsAreNull() {
        String first = null;
        String second = null;

        assertEquals(true, Anagram.isAnagram(first, second));


    }




}
