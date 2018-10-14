import java.util.ArrayList;

public class Ship {

    ArrayList<Pirate> crew;
    Capitan shipCapitan;
  //  Pirate shipPirate;

    public Ship() {
        crew = new ArrayList<>();
        shipCapitan = new Capitan("Capitano");
    }

    public void fillShip() {
        crew.add( this.shipCapitan);
        for (int i = 1; i < (int) (Math.random() * 51 + 2); i++) {
            Pirate shipPirate = new Pirate("pirate" + i);
            crew.add(shipPirate);
        }
    }

    public int countsAlive() {
        int alives = 0;
        for (int i = 0; i < crew.size(); i++) {
            if (crew.get(i).dead == false) {
                alives++;
            }
        }
        return alives;
    }

    public void representShip() {
        System.out.println(this.getClass(). + " ship contains of " + countsAlive() + " pirates alive. " + shipCapitan.rumDrinked +
                " rums drinked by captain.");
    }

    public boolean battle(Ship otherShip) {
        if ((countsAlive() - shipCapitan.rumDrinked) > (otherShip.countsAlive() - otherShip.shipCapitan.rumDrinked)) {
            wins();
            otherShip.losses();
            return true;
        } else {
            otherShip.wins();
            losses();
            return false;
        }
    }



    public void losses (){
        int killed = (int)(Math.random()*((crew.size()-3)));
        for (int i = 1; i < killed ; i++) {
            crew.get(i).dead=true;
        }
    }


    public void wins (){
        for (int i = 0; i <crew.size() ; i++) {
            int rums = (int)(Math.random()*5);
            crew.get(i).rumDrinked = crew.get(i).rumDrinked+rums;
        }
    }
}
