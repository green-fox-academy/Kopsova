import org.junit.Test;

import static org.junit.Assert.*;

public class ApplesTestJU4 {

    Apples apple1 = new Apples("apple");

    @Test
    public void AppleTestSimpe () {

        assertEquals("apple", apple1.getApple());
    }

}