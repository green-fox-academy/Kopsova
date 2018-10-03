import java.util.List;

public class Animal {

    int hunger = 50;
    int thirst = 50;

    public static void main(String[] args) {


    }

    public static void createAnimal(int hunger, int thirst) {
        hunger = 50;
        thirst = 50;
    }

    public static int eat(int hunger) {
        hunger--;
        return hunger;
    }

    public static int drink(int thirst) {
        thirst--;
        return thirst;
    }

    public static void play(int hunger, int thirst) {
        hunger++;
        thirst++;
    }

}
