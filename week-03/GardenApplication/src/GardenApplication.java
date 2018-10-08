import java.lang.reflect.Array;
import java.util.ArrayList;

public class GardenApplication {




    public static void main (String [] args) {

        Flower dandelion = new Flower("yellow");
        Flower bell = new Flower("blue");
        Tree orangeTree = new Tree("orange");
        Tree plum = new Tree("purple");

        Garden myGarden = new Garden();
        myGarden.addPlant(dandelion);
        myGarden.addPlant(bell);
        myGarden.addPlant(orangeTree);
        myGarden.addPlant(plum);

        myGarden.waterInfo();
        myGarden.waterGarden(40);
        myGarden.waterInfo();
        myGarden.waterGarden(70);
        myGarden.waterInfo();


    }

    }
