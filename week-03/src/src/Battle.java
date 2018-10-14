public class Battle {

    public static void main (String[] args){

        Ship Aurora = new Ship();
        Aurora.fillShip();

        Ship Titanic = new Ship();
        Titanic.fillShip();

        Aurora.battle(Titanic);

        Titanic.representShip();
        Aurora.representShip();


    }
}
