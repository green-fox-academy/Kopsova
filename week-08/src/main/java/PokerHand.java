import sun.awt.SunHints;

import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class PokerHand {




    public static String highestCard10(CardsInHand white, CardsInHand black) {
       if (white.whitePlayer.stream().sorted()> black.blackPlayer.stream().sorted().toArray()[4])
            return "White is the winner";
        } else if (blackSorted.get(4).intValue() > whitekSorted.get(4).intValue()) {
            return "Black is the winner";
        } else return "Tie.";
    }
}