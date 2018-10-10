import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    @Test
    public void FibonacciTest() {

        Fibonacci myF = new Fibonacci();
        assertEquals(2,myF.fibb(3));
    }
}