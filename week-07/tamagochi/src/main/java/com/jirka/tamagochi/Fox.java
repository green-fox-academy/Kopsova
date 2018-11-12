
package com.jirka.tamagochi;
import java.util.ArrayList;
import java.util.List;

public class Fox {
    String name;
    List<String> tricks;
    String food;
    String drink;

    public Fox(String name, List<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public Fox() {
    }

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "no drink";
        this.drink = "no food";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTricks(List<String> tricks) {
        this.tricks = tricks;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }
}
