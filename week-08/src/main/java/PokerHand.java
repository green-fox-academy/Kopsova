import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import sun.awt.SunHints;

import javax.smartcardio.Card;
import javax.swing.*;
import java.util.*;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class PokerHand {


    public static void main(String[] args) {
        CardsInHand player = new CardsInHand();
        System.out.println( highestCard10(player));

    }

    public static String highestCard10(CardsInHand hand) {
        int max = 0;
        for (int i = 0; i < hand.whitePlayer.size(); i++) {
            if (hand.whitePlayer.get(i).value > max) {
                max = hand.whitePlayer.get(i).value;
            }

            hand.whitePlayer.stream().sorted((p1, p2) -> p1.value - p2.value);
            hand.whitePlayer.get(4);


        }
        return Integer.toString(hand.whitePlayer.get(4).value);
    }
}