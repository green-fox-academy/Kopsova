
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;


public class NumberConverterTest {

    @Test
    public void testConverting(){
        int number = 1234567891;
        NumberConverter myConvert = new NumberConverter();

        assertEquals( "seven hundred and fifty five", myConvert.convert(number) );

    }

@Test
    public void testsDividing (){
        assertEquals( 1,(123456789%100000/10000));
}

@Test
    public void testfrom1to99(){
        int number = 54000;
        NumberConverter myNum = new NumberConverter();
        assertEquals("fifty four", myNum.from1to99(54));

}
}
