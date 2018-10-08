import java.util.ArrayList;

public class Plant {
    String color;
    String typeOfPlant;
    double needsWater;
    double absorbsWater;


    public Plant(String color) {
        this.color = color;

    }

public void watering (double litrOfWater) {
        needsWater = needsWater - (litrOfWater * absorbsWater);
 }
}