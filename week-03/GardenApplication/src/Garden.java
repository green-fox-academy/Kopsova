import java.util.ArrayList;

public class Garden {

    int wateredPlants = 0;


    ArrayList<Plant> plantsOfTheGarden = new ArrayList<>();

    public void addPlant(Plant plant) {
        plantsOfTheGarden.add(plant);
    }

    public double absorbing(double waterAmount, Plant plant) {

        return waterAmount * plant.absorbsWater;
    }


    private double wateredPlants() {

        for (int i = 0; i < plantsOfTheGarden.size(); i++) {
            if (plantsOfTheGarden.get(i).needsWater > 0) {
                wateredPlants++;
            }
        }
        return wateredPlants;
    }

    private double litrPerPlant(int waterAmount) {
        return (double) waterAmount / wateredPlants();
    }

    public void waterGarden(int waterAmount) {

        for (int i = 0; i < plantsOfTheGarden.size(); i++) {
            if (plantsOfTheGarden.get(i).needsWater > 0) {
                plantsOfTheGarden.get(i).watering(litrPerPlant(waterAmount));
            }
        }
        System.out.println("Watering with " + waterAmount);
    }

    public void waterInfo() {

        for (int i = 0; i < plantsOfTheGarden.size(); i++) {
            if (plantsOfTheGarden.get(i).needsWater > 0) {
                System.out.println("The " + plantsOfTheGarden.get(i).color + " " + plantsOfTheGarden.get(i).getClass().getName()
                        + " needs water.");
            } else {
                System.out.println("The " + plantsOfTheGarden.get(i).color + " " + plantsOfTheGarden.get(i).getClass().getName()
                        + " doesn`t need water.");
            }

        }
    }
}






