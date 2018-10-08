import java.util.ArrayList;

public class Garden {
    String name;
    int wateredPlants = 0;


    public Garden(String name) {
        this.name = name;
    }

    Flower dandelion = new Flower("yellow");
    Flower bell = new Flower("blue");
    Tree orangeTree = new Tree("orange");
    Tree plum = new Tree("purple");

    ArrayList<Plant> plantsOfTheGarden = new ArrayList<>();
    public void addPlant (Plant plant) {
        plantsOfTheGarden.add(plant);
    }

    public double absorbing (double waterAmount, Plant plant){

        return waterAmount * plant.absorbsWater;
    }


    public double wateredPlants (double waterAmount){

        for (int i = 0; i <plantsOfTheGarden.size() ; i++) {
            if (plantsOfTheGarden.get(i).needsWater < 0) {
                wateredPlants++;
            }
        }
        return wateredPlants;
        }
    public double waterPerPlant (double waterAmount, double wateredPlants) {
            return waterAmount / wateredPlants;
        }
    public double waterAbsorbed(double waterAmount, double waterperPlant, Plant plant) {
            return waterperPlant * plant.absorbsWater;
        }
    }






