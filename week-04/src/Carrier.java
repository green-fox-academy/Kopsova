import java.util.ArrayList;

public class Carrier {

    int ammoStored;
    int healthPoint;
    ArrayList<AirCraft> aircraftStored = new ArrayList<>();

    public Carrier(int ammoStored, int healthPoint) {
        this.ammoStored = ammoStored;
        this.healthPoint = healthPoint;
    }


    public void add(AirCraft airCraft) {
        aircraftStored.add(airCraft);
    }

    public void fill() {

        int ammosNeeded = 0;
        for (int i = 0; i < aircraftStored.size(); i++) {

            ammosNeeded = ammosNeeded + aircraftStored.get(i).maxAmmo - aircraftStored.get(i).ammos;
            try {
                if (this.ammoStored <= 0) ;
            } catch (Exception e) {
                System.out.println("Carrier has no ammos.");
            }
        }
        if (ammosNeeded <= ammoStored) {
            for (int i = 0; i < aircraftStored.size(); i++) {
                aircraftStored.get(i).ammos = aircraftStored.get(i).maxAmmo;
            }
            ammoStored -= ammosNeeded;
        } else {
            for (int i = 0; i < aircraftStored.size(); i++) {
                if ((aircraftStored.get(i).isPriority()) && ammoStored >= aircraftStored.get(i).maxAmmo - aircraftStored.get(i).ammos) {
                    aircraftStored.get(i).ammos = aircraftStored.get(i).maxAmmo;
                    ammoStored = ammoStored - (aircraftStored.get(i).maxAmmo - aircraftStored.get(i).ammos);
                } else {
                    aircraftStored.get(i).ammos = aircraftStored.get(i).ammos + ammoStored;
                    ammoStored = 0;
                }
            }
            for (int i = 0; i < aircraftStored.size(); i++) {
                if (ammoStored >= aircraftStored.get(i).maxAmmo - aircraftStored.get(i).ammos) {
                    aircraftStored.get(i).ammos = aircraftStored.get(i).maxAmmo;
                    ammoStored = ammoStored - (aircraftStored.get(i).maxAmmo - aircraftStored.get(i).ammos);
                } else {
                    aircraftStored.get(i).ammos = aircraftStored.get(i).ammos + ammoStored;
                    ammoStored = 0;
                }
            }
        }
    }

    public void fight(Carrier anotherCarrier) {
        int damage = 0;
        for (int i = 0; i < aircraftStored.size(); i++) {
            damage += aircraftStored.get(i).fight();
        }
        anotherCarrier.healthPoint -= damage;
    }

    public String getStatus() {
        int totalDamage = 0;
        for (int i = 0; i < aircraftStored.size(); i++) {
            totalDamage += aircraftStored.get(i).allDamage;
        }
        if (healthPoint == 0) {
            return "It is dead, jim >?(";
        } else {
            return
                    "HP: " + healthPoint + ", Aircraft count: " + aircraftStored.size() + ", Ammo Storage: " + ammoStored +
                            ", Total Damage: " + totalDamage + "\n"
                            + "Aircrafts: \n" + getStatusAllAIrcrafts();
        }
    }

    public String getStatusAllAIrcrafts() {
        String all = "";
        for (int i = 0; i < aircraftStored.size(); i++) {
            all = all + aircraftStored.get(i).getStatus() + "\n";

        }
        return all;
    }
}




