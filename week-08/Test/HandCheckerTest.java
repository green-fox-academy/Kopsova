import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;


public class HandCheckerTest {


    Map<String, Integer> blackHand =  new HashMap<>();
    Map<String, Integer> whiteHand =  new HashMap<>();




//    String [] black = {"2H", "3D", "5S", "9C","KD"};
//    String[] white= {"2C", "3H", "4S", "8C","AH"};


    @Test
    public void highestCard10Test (){
        Integer J=11;
        Integer Q=12;
        Integer K=13;
        Integer A=14;
        blackHand.put("H",3);
        blackHand.put("D",2);
        blackHand.put("S",5);
        blackHand.put("C",9);
        blackHand.put("D",K);
        blackHand.put("D",2);
        whiteHand.put("C", 2);
        whiteHand.put("S", 4);
        whiteHand.put("C", 8);
        whiteHand.put("H", 3);
        whiteHand.put("H", A);
        assertEquals("White is the winner",PokerHand.highestCard10(blackHand, whiteHand) );

    }


}
