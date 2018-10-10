import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SumTest {



    @Test
    public void SumTestMoreElements (){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        Sum myList = new Sum(list);

        assertEquals(6, myList.sum(list));
    }

    @Test
    public void SumTestNoElement(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList());
        Sum myList = new Sum(list);
        assertEquals(0, myList.sum(list));
    }

    @Test

    public void SumTestOneElement(){
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2));
        Sum myList = new Sum(list);
        assertEquals(2,myList.sum(list));

    }


}