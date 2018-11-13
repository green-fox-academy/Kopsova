import java.util.ArrayList;

public class CardsInHand {


    ArrayList<Card> whitePlayer = new ArrayList<Card>();
    ArrayList<Card> blackPlayer = new ArrayList<Card>();
    int J = 11;
    int Q = 12;
    int K = 13;
    int A = 14;

    public CardsInHand() {

        whitePlayer.add(new Card("C",2));
        whitePlayer.add(new Card("H",3));
        whitePlayer.add(new Card("S",4));
        whitePlayer.add(new Card("C",8));
        whitePlayer.add(new Card("H",A));
        blackPlayer.add(new Card("H",2));
        blackPlayer.add(new Card("D",3));
        blackPlayer.add(new Card("S",5));
        blackPlayer.add(new Card("C",9));
        blackPlayer.add(new Card("D",K));
    }
}
