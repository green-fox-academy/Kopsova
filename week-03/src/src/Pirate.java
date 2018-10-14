public class Pirate {

public  String name;
public int rumDrinked =0 ;
public boolean dead = false;

    public Pirate(String name) {
        this.name = name;
    }


public static void main (String [] args) {


}

public  void drinkSomeRum ( ) {
    if ((this.dead == true)) {
        System.out.println("He is dead.");
    } else {
        this.rumDrinked++;
    }
}

public void howsItGoingMate(){
    if (this.dead == true){
        System.out.println("He is dead.");
    } else {
        if (rumDrinked < 5) {
            System.out.println("Pour me anudder!");
        } else {
            System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        }
    }
}

public void die () {
    this.dead = true;
}

public void brawl (Pirate pirate) {
    if (pirate.dead == true) {
        System.out.println(pirate.name + "is allready dead!");
    } else {
        if (this.dead = true) {
            System.out.println("He is dead.");
        } else {
            int chance = (int) (Math.random() * 3);
            if (chance == 0) {
                pirate.dead = true;
            } else {
                if (chance == 1) {
                    this.dead = true;
                } else {
                    if (chance == 2) {
                        this.dead = false;
                        pirate.dead = false;
                    }
                }
            }
        }
    }
}
}
